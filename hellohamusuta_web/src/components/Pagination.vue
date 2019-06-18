<template>
  <el-footer>
    <div id="pagination">
      <el-pagination layout="prev, pager, next" :current-page.sync="currentPage" :total="total"></el-pagination>
    </div>
  </el-footer>
</template>

<script>
export default {
  name: "pagination",
  data() {
    return {
      total: 5,
      currentPage: 1
    };
  }
};
</script>

<style lang="stylus" scoped></style>
