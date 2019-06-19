import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue'

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home
    },
    //编辑页面
    {
      path: '/creativity',
      name: 'creativity',
      component: () => import('./views/Creativity.vue')
    },
    //搜索页面
    {
      path: '/serchpage',
      name: 'serchpage',
      component: () => import('./views/SerchPage.vue')
    },
    //展示页面
    {
      path: '/showpage',
      name: 'showpage',
      component: () => import('./views/ShowPage.vue')
    }
  ]
})
