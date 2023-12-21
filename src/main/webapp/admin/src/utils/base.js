const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm6f770/",
            name: "ssm6f770",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm6f770/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "学生寝室管理系统"
        } 
    }
}
export default base
