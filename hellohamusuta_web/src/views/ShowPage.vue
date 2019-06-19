<template>
  <div id="showpage">
    <TopGroundPicture/>
    <SerchBar/>
    <NavBar v-on:typeid="getChildData"/>
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

export default {
  name: "showpage",
  components: {
    TopGroundPicture,
    SerchBar,
    NavBar,
    Pagination,
    SingleArt
  },
  data() {
    return {
      typeid: 1,
      artresult: null,
      pageNum: 1,
      pages: null
    };
  },
  activated() {
    this.getRouterData();
    this.getartbyid();
  },
  methods: {
    //获取关键词
    getRouterData: function() {
      this.typeid = this.$route.query.typeid;
    },
    //根据类型ID查询相关文章
    getartbyid: function() {
      if (this.typeid == null) {
        alert("内部错误，请重选类型!");
      } else {
        //发送post请求
        this.$http({
          method: "post",
          url:
            "/article/getartpage?typeId=" +
            this.typeid +
            "&pageNum=" +
            this.pageNum
        })
          .then(res => {
            alert(JSON.stringify(res.data.data));
            this.artresult = res.data.data.list;
            this.pages = res.data.data;
          })
          .catch(err => {
            alert(err);
          });
      }
    },
    //监听到子组件参数时进行查询
    getChildData: function(data) {
      //alert(333)
      this.typeid = data;
      this.getartbyid();
    },
    //获取当前页数并重新查询
    getPageNum: function(data) {
      this.pageNum = data;
      this.getartbyid();
    }
  }
};
</script>

<style lang="stylus" scoped>
#pagination {
  text-align: center;
  margin-bottom: 70px;
}

#singleart {
  text-align: center;
  margin-left: 300px;
  margin-top: 200px;
}
</style>
