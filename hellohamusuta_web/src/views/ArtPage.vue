<template>
  <div id="artpage">
    <TopGroundPicture/>
    <SerchBar/>
    <h2>{{article.title}}</h2>
    <h3>{{article.perface}}</h3>
    <div v-html="article.content"></div> 
    <h5>{{article.createTime}}</h5>
    <NavBar/>
  </div>
</template>

<script>
import TopGroundPicture from "@/components/TopGroundPicture.vue";
import SerchBar from "@/components/SerchBar.vue";
import NavBar from "@/components/NavBar.vue";

export default {
  name: "artpage",
  components: {
    TopGroundPicture,
    SerchBar,
    NavBar
  },
  data() {
    return {
      id: 0,
      article: null
    };
  },
  methods: {
    //路由跳转时获取参数
    getRouterData: function() {
      this.id = this.$route.query.id;
    },
    //根据id获取文章实体
    getarticlecontent: function() {
      this.$http
        .get("/article/getartindexbyid/" + this.id)
        .then(res => {
          //alert(JSON.stringify(res.data.data));
          this.article = res.data.data;
        })
        .catch(err => {
          alert(err);
        });
    }
  },
  activated() {
    this.getRouterData();
    this.getarticlecontent();
  }
};
</script>

<style lang="stylus" scoped>
h2 {
  margin-top: 200px;
}
</style>
