<template>
  <div id="editor">
    <div id="editorElem"></div>
    <button v-on:click="getContent">查看内容</button>
  </div>
</template>

<script>
import E from "wangeditor";

export default {
  name: "editor",
  data() {
    return {
      editorContent: ""
    };
  },
  methods: {
    getContent: function() {
      alert(this.editorContent);
    }
  },
  mounted() {
    var editor = new E("#editorElem");
    editor.customConfig.onchange = html => {
      this.editorContent = html;
    };
    editor.create();
  }
};
</script>

<style scope lang="stylus">
#editorElem {
  text-align: left;
  margin-top: 150px;
}

.w-e-text-container{
    height: 700px !important;
}
</style>

