<template>
  <div id="editor">
    <div id="editorElem"></div>
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
  methods: {},
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
  margin-left: 150px;
  width: 1200px;
}

.w-e-text-container {
  height: 700px !important;
  background-color: white;
}
</style>

