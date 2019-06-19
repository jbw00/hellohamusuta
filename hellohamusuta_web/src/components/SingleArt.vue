<template>
  <div id="singleart">
    <div v-for="art in sercharts" :key="art" class="text item">
      <el-card class="box-card" shadow="hover">
        <img
          :src="art.picture"
          class="image"
        >
        <h2>{{art.title}}</h2>
        <hr>
        <h3>{{art.preface}}</h3>
        <hr>
        <el-row id="button">
          <el-button type="danger" round>
            <i class="el-icon-watermelon"></i>赞啦！
          </el-button>
          <el-button type="success" round>
            <i class="el-icon-view"></i>瞅瞅！
          </el-button>
        </el-row>
      </el-card>
    </div>
  </div>
</template>

<script>
export default {
  name: "singleart",
  data() {
    return {
    //   sercharts: ""
    };
  },
  props:["sercharts"]
};
</script>

<style lang="stylus" scoped>
.text {
  font-size: 14px;
}

.item {
  padding: 18px 0;
}

.box-card {
  width: 1200px;
  height: 400px;
}

.image {
  width: 500px;
  display: block;
  height: 360px;
}

h2 {
  margin-top: -320px;
  margin-left: 500px;
}

h3 {
  margin-left: 520px;
  height: 200px;
}

#button {
  margin-left: 800px;
}

hr {
  height: 1.5px;
  border: none;
  border-top: 1px dashed gray;
}
</style>
