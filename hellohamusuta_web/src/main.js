import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import './plugins/element.js'
import axios from 'axios' //引入axios
import ElementUI from 'element-ui' //引入element
import 'element-ui/lib/theme-chalk/index.css' //引入element.css文件

Vue.config.productionTip = false
Vue.prototype.$http = axios //挂载axios
Vue.use(ElementUI) //挂载ElementUI

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
