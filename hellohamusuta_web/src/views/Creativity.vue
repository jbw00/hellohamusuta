<template>
  <!-- 编辑页面 -->
  <div id="creativity" style="background-image:url('../assets/backg.jpg')">
    <TopGroundPicture/>
    <NavBar/>
    <el-input class="input" placeholder="请输入标题" v-model="input1">
      <template slot="prepend">标题</template>
    </el-input>
    <el-input class="input" placeholder="请输入封面图片链接" v-model="input1">
      <template slot="prepend">图片</template>
    </el-input>
    <el-input class="input" placeholder="请输入前言" v-model="input2">
      <template slot="prepend">
        <el-checkbox v-model="checked1">前言</el-checkbox>
      </template>
    </el-input>
    <el-input class="input" placeholder="请输入音乐链接" v-model="input3">
      <template slot="prepend">
        <el-checkbox v-model="checked2">音乐</el-checkbox>
      </template>
    </el-input>
    <el-select class="select" v-model="value" placeholder="请选择">
      <el-option v-for="item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
    </el-select>
    <Editor/>
  </div>
</template>

<script>
import TopGroundPicture from "@/components/TopGroundPicture.vue";
import NavBar from "@/components/NavBar.vue";
import Editor from "@/components/Editor.vue";

export default {
  name: "creativity",
  components: {
    TopGroundPicture,
    NavBar,
    Editor
  },
  data() {
    return {
      options: [
        {
          value: "选项1",
          label: "日语"
        },
        {
          value: "选项2",
          label: "音乐"
        },
        {
          value: "选项3",
          label: "技术"
        },
        {
          value: "选项4",
          label: "小说"
        },
        {
          value: "选项5",
          label: "摄影"
        }
      ],
      value: "文章类型",
      checked: true
    };
  }
};
</script>

<style scoped lang = "stylus">
.input {
  top: 80px;
  width: 600px;
  margin-left: 80PX;
  margin-top: 20px;
}

.select {
  top: 100px;
  width: 120px;
  margin-left: 80PX;
}
</style>


