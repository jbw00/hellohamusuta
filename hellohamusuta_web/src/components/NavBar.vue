<template>
  <div id="navBer">
    <!-- 导航栏 -->
    <el-menu
      class="el-menu-demo"
      mode="horizontal"
      @select="handleSelect"
      background-color="#7E7E7E"
      text-color="#fff"
      active-text-color="#ffd04b"
    >
      <el-menu-item index="1">仓鼠窝</el-menu-item>
      <el-menu-item index="2">日语</el-menu-item>
      <el-menu-item index="3">音乐</el-menu-item>
      <el-submenu index="4">
        <template slot="title">文章</template>
        <el-menu-item index="4-1">技术</el-menu-item>
        <el-menu-item index="4-2">小说</el-menu-item>
        <el-menu-item index="4-3">摄影</el-menu-item>
      </el-submenu>
      <el-menu-item index="5">剥瓜子</el-menu-item>
    </el-menu>
  </div>
</template>

<script>
export default {
  name: "NavBar",
  data() {
    return {
      routerpath: "/showpage",
      keyPath: 1,
      typeid: 1
    };
  },
  methods: {
    //获取typeid
    handleSelect(keyPath) {
      this.keyPath = keyPath;
      this.routercase();
    },
    //传参至指定页面
    routercase: function() {
      this.sarcharticle();
      switch (this.keyPath) {
        case "1":
          this.$router.push("/");
          break;
        case "2":
          this.routerTo(1);
          break;
        case "3":
          this.routerTo(2);
          break;
        case "4-1":
          this.routerTo(3);
          break;
        case "4-2":
          this.routerTo(4);
          break;
        case "4-3":
          this.routerTo(5);
          break;
        case "5":
          this.$router.push("/creativity");
          break;
        default:
          this.$router.push("/");
          break;
      }
    },
    //判断传参方式
    sarcharticle: function() {
      //判断页面是否为搜索页面
      if (this.$route.path == this.routerpath) {
        switch (this.keyPath) {
          case "2":
            this.typeid = 1;
            break;
          case "3":
            this.typeid = 2;
            break;
          case "4-1":
            this.typeid = 3;
            break;
          case "4-2":
            this.typeid = 4;
            break;
          case "4-3":
            this.typeid = 5;
            break;
        }
        //搜索页面向父组件传值
        this.$emit("typeid", this.typeid);
      }
    },
    //路由
    routerTo: function(typeid) {
      this.$router.push({
        path: this.routerpath,
        query: {
          typeid: typeid
        }
      });
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
