<template>
  <div id="serchpage">
    <TopGroundPicture/>
    <SerchBar v-on:keyword="getChildData"/>
    <h3 id="message">{{message}}</h3>
    <NavBar/>
    <SingleArt id="singleart" :sercharts="artresult"/>
    <Pagination id="pagination" v-on:pagenum="getPageNum" :pages="pages"/>
  </div>
</template>

<script>
import TopGroundPicture from "@/components/TopGroundPicture.vue";
import SerchBar from "@/components/SerchBar.vue";
import NavBar from "@/components/NavBar.vue";
import Pagination from "@/components/Pagination.vue";
import SingleArt from "@/components/SingleArt.vue";
//import Qs from "qs";

export default {
  name: "serchpage",
  components: {
    TopGroundPicture,
    SerchBar,
    NavBar,
    Pagination,
    SingleArt
  },
  data() {
    return {
      pageNum: 1,
      keyword: null,
      message: "",
      sercharticles: "",
      artresult: "",
      pages: ""
    };
  },
  activated() {
    this.getRouterData();
    this.getartbykeyword();
  },
  methods: {
    //路由跳转时获取参数
    getRouterData: function() {
      this.keyword = this.$route.query.keyword;
    },
    //监听到子组件参数时进行查询
    getChildData: function(data) {
      this.keyword = data;
      this.getartbykeyword();
    },
    //模糊查询相关文章
    getartbykeyword: function() {
      if (this.keyword == "nullKeyword" || this.keyword == null) {
        this.message = "请输入关键字并查询!";
      } else {
        this.message = "以下是搜索到的相关内容：";
        //发送post请求
        this.$http({
          method: "post",
          url:
            "/article/getartbykeyword?keyword=" +
            this.keyword +
            "&pageNum=" +
            this.pageNum
        })
          .then(res => {
            //alert(JSON.stringify(res.data.data));
            this.artresult = res.data.data.list;
            this.pages = res.data.data;
          })
          .catch(err => {
            alert(err);
          });
      }
    },
    //获取当前页数并重新查询
    getPageNum: function(data) {
      this.pageNum = data;
      this.getartbykeyword();
    }
  }
};
</script>


<style scope lang="stylus">
#message {
  margin-top: 180px;
  text-align: center;
}

#pagination {
  text-align: center;
  margin-bottom: 70px;
}

#singleart {
  text-align: center;
  margin-left: 300px;
}
</style>
