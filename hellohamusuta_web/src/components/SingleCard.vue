<template>
  <div id="card">
    <el-row>
      <el-col v-for="(o, index) in 4" :key="o" :offset="index > 0 ? 3 : 0" style="width:200px">
        <el-card :body-style="{ padding: '0px'}">
          <img
            src="https://shadow.elemecdn.com/app/element/hamburger.9cf7b091-55e9-11e9-a976-7f4d0b07eef6.png"
            class="image"
          >
          <div style="padding: 14px;">
            <span>好吃的汉堡</span>
            <span>sadsadasdasdadasdasdasdadasdsadasdasdasdasdad</span>
            <div class="bottom clearfix">
              <!-- <el-button type="danger" icon="el-icon-watermelon" class="like" circle></el-button> -->
              <el-button type="success" class="button" plain>&nbsp;瞅瞅？</el-button>
            </div>
          </div>
        </el-card>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  name: "card",
  data() {}
};
</script>

<style scoped lang = 'stylus'>
.el-card {
  width: 300px;
}

.bottom {
  margin-top: 13px;
  line-height: 12px;
}

.button {
  padding: 0;
  width: 60px;
  height: 30px;
  float: right;
}

.like {
  height: 30px;
  width: 30px;
}

.image {
  width: 100%;
  display: block;
}

.clearfix:before, .clearfix:after {
  display: table;
  content: '';
}

.clearfix:after {
  clear: both;
}
</style>
