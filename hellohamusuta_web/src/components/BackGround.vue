<template>
  <div id="background"></div>
</template>

<script>
export default {
  name: "background"
};
</script>

<style scope lang="stylus">
#background {
  width: 100%;
  height: 1600px;
  background: url('../assets/backg.jpg') center center repeat;
  background-size: 100px auto;
  z-index: -1;
}
</style>
