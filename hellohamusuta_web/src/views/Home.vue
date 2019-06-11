<template>
  <div class="home">
    <TopGroundPicture/>
    <SerchBar/>
    <NavBar/>
  </div>
</template>

<script>
// @ 连接到 /src
import TopGroundPicture from '@/components/TopGroundPicture.vue'
import SerchBar from '@/components/SerchBar.vue'
import NavBar from '@/components/NavBar.vue'

export default {
  name: 'home',
  components: {
    TopGroundPicture,
    SerchBar,
    NavBar,
  }
}
</script>
