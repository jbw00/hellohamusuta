<template>
  <div id="carousel">
    <el-carousel :interval="4000" type="card" height="500px">
      <el-carousel-item v-for="art in lastarticles" :key="art">
        <img class="backImg" :src="art.picture" @click="sendartid(art.id)">
        <p class="medium">{{ art.title }}</p>
      </el-carousel-item>
    </el-carousel>
  </div>
</template>

<script>
export default {
  name: "carousel",
  data() {
    return {
      lastarticles: "",
      routerpath: "/artpage"
    };
  },
  activated() {
    this.getLestArticle();
  },
  methods: {
    //获取轮播页最新文章
    getLestArticle: function() {
      this.$http
        .get("/article/getartindex/4")
        .then(res => {
          this.lastarticles = res.data.data;
          //alert(JSON.stringify(this.lastarticles));
        })
        .catch(err => {
          alert(err);
        });
    },
    //传递指定文章id路由至展示页面
    sendartid: function(id) {
      this.routerTo(id);
    },
    routerTo: function(id) {
      this.$router.push({
        path: this.routerpath,
        query: {
          id: id
        }
      });
    }
  }
};
</script>

<style scoped lang = 'stylus'>
.el-carousel__item h3 {
  color: #475669;
  font-size: 14px;
  opacity: 0.75;
  line-height: 200px;
  margin: 0;
}

.el-carousel__item:nth-child(2n) {
  background-color: #99a9bf;
}

.el-carousel__item:nth-child(2n+1) {
  background-color: #d3dce6;
}

.backImg {
  width: 100%;
  height: 100%;
}

.medium {
  position: relative;
  top: -90px;
  background-color: rgba(96, 96, 96, 0.8);
  height: 60px;
  text-align: center;
  line-height: 60px;
  font-size: 30px;
  color: white;
}
</style>
