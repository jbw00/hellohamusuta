<template>
  <div id="navBer">
    <!-- 导航栏 -->
    <el-menu
      :default-active="activeIndex2"
      class="el-menu-demo"
      mode="horizontal"
      @select="handleSelect"
      background-color="#7E7E7E"
      text-color="#fff"
      active-text-color="#ffd04b"
    >
      <el-menu-item index="1">
        <router-link to="/">仓鼠窝</router-link>
        <router-view/>
      </el-menu-item>
      <el-menu-item index="2">
        <router-link to="/">日语</router-link>
        <router-view/>
      </el-menu-item>
      <el-menu-item index="3">
        <router-link to="/">音乐</router-link>
        <router-view/>
      </el-menu-item>
      <el-submenu index="4">
        <template slot="title">文章</template>
        <el-menu-item index="4-1">技术</el-menu-item>
        <el-menu-item index="4-2">小说</el-menu-item>
        <el-menu-item index="4-3">摄影</el-menu-item>
      </el-submenu>
      <el-menu-item index="5">
        <router-link to="/creativity">剥瓜子</router-link>
        <router-view/>
      </el-menu-item>
    </el-menu>
  </div>
</template>

<script>
export default {
  name: "NavBar",
  data() {
    return {
      activeIndex: "1",
      activeIndex2: "1"
    };
  },
  methods: {
    handleSelect(key, keyPath) {
      console.log(key, keyPath);
    }
  }
};
</script>

<style scoped lang = "stylus">
#navBer {
  position: fixed;
  width: 100%;
  z-index: 50;
  height: 60px;
  bottom: 0px;
  z-index: 2147483647;
}

/* 消除routerlink下划线 */
a {
  text-decoration: none;
}

.router-link-active {
  text-decoration: none;
}
</style>
