<template>
  <div id="serchPage">
    <TopGroundPicture/>
    <SerchBar/>
    <h3 id="message">{{message}}</h3>
    <NavBar/>
  </div>
</template>

<script>
import TopGroundPicture from "@/components/TopGroundPicture.vue";
import SerchBar from "@/components/SerchBar.vue";
import NavBar from "@/components/NavBar.vue";
//import Qs from "qs";

export default {
  name: "serchpage",
  components: {
    TopGroundPicture,
    SerchBar,
    NavBar
  },
  data() {
    return {
      pageNum: 1,
      keyword: null,
      message: "",
      sercharticles: ""
    };
  },
  activated() {
    this.getRouterData();
    this.getartbykeyword();
  },
  methods: {
    getRouterData: function() {
      this.keyword = this.$route.query.keyword;
    },
    getartbykeyword: function() {
      if (this.keyword == "nullKeyword" || this.keyword == null) {
        this.message = "请输入关键字并查询!";
      } else {
      this.message = "以下是搜索到的相关内容：";
      //发送post请求
      this.$http({
        method: "post",
        url: "/article/getartbykeyword?keyword="+ this.keyword +"&pageNum=" + this.pageNum,
      })
        .then(res => {
          alert(JSON.stringify(res.data));
        })
        .catch(err => {
          alert(err);
        });
      }
    }
  }
};
</script>


<style scope lang="stylus">
#message {
  margin-top: 180px;
  text-align: center;
}
</style>
