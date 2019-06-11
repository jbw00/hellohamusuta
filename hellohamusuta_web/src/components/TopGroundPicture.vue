<template>
  <div class="topgroundPicture">
    <!-- 顶部图片标题栏 -->
    <div>
      <img
        class="backgroundPicture"
        src="../assets/img/background.jpg"
        title="hamuusta!"
        alt="backgroundpicture"
      >
    </div>
    
  </div>
</template>

<script>
export default {
  name: "TopGroundPicture"
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="stylus">
.backgroundPicture {
  position: fixed;
  width: 100%;
  z-index: 2147483647;
  height: 70px;
  top: 0px;
}
</style>

