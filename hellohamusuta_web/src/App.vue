<template>
  <div id="app">
    <router-link to="/"/>
    <router-view/>
    <div class="backg"></div>
  </div>
</template>

<script>
export default {};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  margin: -8px;
  padding: 0px;
}
 .backg{
    width: 100%;
    height: 1600px;
    background: url('./assets/backg.jpg') center center repeat;
    background-size: 100px auto;
  }
</style>
