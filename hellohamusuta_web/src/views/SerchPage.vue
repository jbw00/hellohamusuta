<template>
  <div id="serchPage">
    <h1>查询页面</h1>
  </div>
</template>

<script>
export default {
  name: "serchpage",
  data() {
    return {
      page: "",
      keyword: ""
    };
  },
  methods: {
    getRouterData: function() {
      this.keyword = this.$route.params.keyword;
      this.page = this.$route.params.page;
    }
  },
  activated() {
    this.getRouterData();
  }
};
</script>


<style>
</style>
