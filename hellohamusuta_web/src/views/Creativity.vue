<template>
  <!-- 编辑页面 -->
  <div id="creativity" style="background-image:url('../assets/backg.jpg')">
    <TopGroundPicture/>
    <NavBar/>
    <el-input class="input" placeholder="请输入标题" v-model="title">
      <template slot="prepend">标题</template>
    </el-input>
    <el-input class="input" placeholder="请输入封面图片链接" v-model="picture">
      <template slot="prepend">图片</template>
    </el-input>
    <el-select class="select" v-model="value" placeholder="请选择">
      <el-option v-for="item in options" :key="item.value" :label="item.name" :value="item.id"></el-option>
    </el-select>
    <el-input class="choseinput" placeholder="请输入前言" v-model="preface">
      <template slot="prepend">
        <el-checkbox v-model="checkedPreface">前言</el-checkbox>
      </template>
    </el-input>
    <el-input class="choseinput" placeholder="请输入音乐链接" v-model="music">
      <template slot="prepend">
        <el-checkbox v-model="checkedMusic">音乐</el-checkbox>
      </template>
    </el-input>
    <Editor ref="editorChild" class="editor"/>
    <el-button @click="getArticle" class="completed" type="info" round>完成编辑</el-button>
  </div>
</template>

<script type="text/javascript">
import TopGroundPicture from "@/components/TopGroundPicture.vue";
import NavBar from "@/components/NavBar.vue";
import Editor from "@/components/Editor.vue";
// import Qs from "qs";

export default {
  name: "creativity",
  components: {
    TopGroundPicture,
    NavBar,
    Editor
  },
  data() {
    return {
      options: "",
      value: "文章类型",
      checkedPreface: false,
      checkedMusic: false,
      preface: null,
      music: null,
      title: null,
      picture: null
    };
  },
  activated() {
    this.getArticleType();
  },
  methods: {
    //初始获取文章类型
    getArticleType: function() {
      this.$http
        .get("/type/gettypelist")
        .then(res => {
          this.options = res.data.data;
        })
        .catch(err => {
          alert(err);
        });
    },
    //获取文章数据
    getArticle: function() {
      var articleMessage = {};
      //判断入参是否为空
      if (
        this.title == null ||
        this.picture == null ||
        this.value == "文章类型"
      ) {
        alert("请填写标题、图片链接或是文章类型！");
      } else {
        if (this.checkedPreface && this.music == null) {
          alert("请填写前言！");
        }
        if (this.checkedMusic && this.preface == null) {
          alert("请填写音乐链接！");
        }
        articleMessage.content = this.$refs.editorChild.editorContent;
        articleMessage.title = this.title;
        articleMessage.typeId = this.value;
        articleMessage.preface = this.preface;
        articleMessage.music = this.music;
        articleMessage.picture = this.picture;
        //alert(JSON.stringify(articleMessage));
        //发送post请求
        // this.$http
        //   .post("/article/newarticle", { data: JSON.stringify(articleMessage) })
        //   .then(res => {
        //     alert(res.data);
        //   })
        //   .catch(err => {
        //     alert(err);
        //   });
        this.$http({
          method: "post",
          url: "/article/newarticle",
          data: articleMessage
        })
          .then(res => {
            alert(res.data.message);
          })
          .catch(err => {
            alert(err);
          });
      }
    }
  }
};
</script>

<style scoped lang = "stylus">
.input {
  top: 80px;
  width: 520px;
  margin-left: 80PX;
  margin-top: 25px;
}

.select {
  top: 80px;
  width: 120px;
  margin-left: 80PX;
  margin-top: 25px;
}

.choseinput {
  top: 100px;
  width: 620px;
  margin-left: 80PX;
  margin-top: 25px;
}

.completed {
  margin-top: 60px;
  margin-left: 700px;
  margin-bottom: 80px;
}

.editor {
  margin-top: 180px;
  z-index: -10;
}
</style>


