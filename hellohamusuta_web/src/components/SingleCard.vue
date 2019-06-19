<template>
  <div id="card">
    <el-row>
      <el-col
        v-for="(hotarticles, index) in hotarticles"
        :key="hotarticles.title"
        :offset="index > 0 ? 3 : 0"
        style="width:200px"
      >
        <el-card :body-style="{ padding: '0px'}">
          <img :src="hotarticles.picture" class="image">
          <div style="padding: 14px;">
            <h4>{{hotarticles.title}}</h4>
            <hr>
            <h5>{{hotarticles.preface}}</h5>
            <div class="bottom clearfix">
              <el-row>
                <el-button type="danger" class="button" plain>
                  <i class="el-icon-watermelon"/>赞啦！
                </el-button>
                <el-button type="success" class="button" plain>
                  <i class="el-icon-view"/>瞅瞅？
                </el-button>
              </el-row>
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
  data() {
    return {
      hotarticles: ""
    };
  },
  activated() {
    this.getLestArticle();
  },
  methods: {
    getLestArticle: function() {
      this.$http
        .get("/article/gethotart/4")
        .then(res => {
          this.hotarticles = res.data.data;
          //alert(JSON.stringify(this.articles));
        })
        .catch(err => {
          alert(err);
        });
    }
  }
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
  margin-left: 20px;
}

.like {
  height: 30px;
  width: 30px;
}

.image {
  width: 100%;
  height: 200px;
  display: block;
}

.clearfix:before, .clearfix:after {
  display: table;
  content: '';
}

.clearfix:after {
  clear: both;
}

h5 {
  width: 260px;
  height: 80px;
}
</style>
