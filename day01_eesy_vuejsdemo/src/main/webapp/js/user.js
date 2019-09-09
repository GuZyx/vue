new Vue({
    el:"#app",
    data:{
        user:{
            id:"",
            username:"",
            password:"",
            age:"",
            sex:"",
            email:""
        },
        userList:[]
    },
    methods:{
        findAll:function () {
          var _this=this;
          axios.get("/day01_eesy_vuejsdemo/user/findAll.do")
              .then(function (value) {
                  _this.userList = value.data;
                  console.log(value);
              })
              .catch(function (reason) {
                  console.log(reason);
              })
        },
        findById:function (userId) {
            var _this=this;
            axios.get("/day01_eesy_vuejsdemo/user/findById.do",{params:{id:userId}})
                .then(function (value) { 
                    _this.user = value.data;
                    $('#myModal').modal("show");
                })
                .catch(function (reason) {
                    console.log(reason);
                })
        },
        update:function () {
            var _this=this;
            axios.post("/day01_eesy_vuejsdemo/user/updateUser.do",_this.user)
                .then(function () {
                    _this.findAll();
                })
                .catch(function (reason) {
                    console.log(reason);
                })
        }
    },
    created(){
        this.findAll();
    }
});