<template>
  <el-footer>
    <div id="pagination">
      <el-pagination
        layout="prev, pager, next"
        :current-page.sync="pages.pageNum"
        :page-count="pages.pages"
        @current-change="getpagenum"
        background
      ></el-pagination>
    </div>
  </el-footer>
</template>

<script>
export default {
  name: "pagination",
  data() {
    return {};
  },
  methods: {
    getpagenum: function() {
      this.$emit("pagenum", this.pages.pageNum);
    }
  },
  props: ["pages"]
};
</script>

<style lang="stylus" scoped></style>
