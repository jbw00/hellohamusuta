<template>
  <div class="serchBar">
    <!-- 顶部搜索栏 -->
    <div id="homePageUINavigationBar" style="width: 100%">
      <!-- logo -->
      <div>
        <img src="../assets/img/hamusuta.png" title="hamuusta!" alt="logo">
      </div>
      <div>
        <form>
          <input type="text" placeholder="  瓜子？">
          <button type="submit">&nbsp;找找！</button>
        </form>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "SerchBar"
};
</script>

<style scoped lang = "stylus">
#homePageUINavigationBar {
  position: fixed;
  z-index: 50;
  top: 70px;
  height: 60px;
  width: 100%;
  background-color: rgb(126, 126, 126);
  padding: 0px;
  overflow: hidden;
  box-shadow: 6px 3px 13px 2px #000000b0;
}

#homePageUINavigationBar img {
  height: 60px;
  margin: auto auto;
  float: left;
}

#homePageUINavigationBar form {
  margin-top: 20px;
  height: 40px;
  width: 250px;
  float: right;
}

#homePageUINavigationBar input {
  width: 120px;
  border-radius: 50px;
  border: 2px solid rgb(55, 62, 63);
  background: rgb(253, 242, 200);
  transition: 0.3s linear;
  float: left;
}

#homePageUINavigationBar input:focus {
  width: 140px;
  color: #324b4e;
}

#homePageUINavigationBar button {
  width: 60px;
  float: left;
  top: -2px;
  border-radius: 25px;
  border: 1.5px solid rgb(253, 242, 200);
  background: #400302;
  text-align: center;
  color: rgb(236, 236, 236);
}

#homePageUINavigationBar button:after {
  color: #324b4e;
}
</style>

