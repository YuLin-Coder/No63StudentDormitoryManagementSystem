import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import qinshibaoxiu from '@/views/modules/qinshibaoxiu/list'
    import qinshixinxi from '@/views/modules/qinshixinxi/list'
    import weixiugong from '@/views/modules/weixiugong/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import gonggaoxinxi from '@/views/modules/gonggaoxinxi/list'
    import qinshianpai from '@/views/modules/qinshianpai/list'
    import weixiuqingkuang from '@/views/modules/weixiuqingkuang/list'
    import users from '@/views/modules/users/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/qinshibaoxiu',
        name: '寝室报修',
        component: qinshibaoxiu
      }
          ,{
	path: '/qinshixinxi',
        name: '寝室信息',
        component: qinshixinxi
      }
          ,{
	path: '/weixiugong',
        name: '维修工',
        component: weixiugong
      }
          ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
          ,{
	path: '/gonggaoxinxi',
        name: '公告信息',
        component: gonggaoxinxi
      }
          ,{
	path: '/qinshianpai',
        name: '寝室安排',
        component: qinshianpai
      }
          ,{
	path: '/weixiuqingkuang',
        name: '维修情况',
        component: weixiuqingkuang
      }
          ,{
	path: '/users',
        name: '管理员',
        component: users
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
