<template>
  <div id="app">
    <router-link to="/"/>
    <keep-alive>
      <router-view/>
    </keep-alive>
    <!-- <BackGround/> -->
  </div>
</template>

<script>
// import BackGround from "@/components/BackGround.vue";

export default {
  name: "app",
  components: {
    // BackGround
  }
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  margin: -8px;
  padding: 0px;
}

body {
  background: url("./assets/backg.jpg") center center repeat;
  background-size: 100px auto;
}
</style>
