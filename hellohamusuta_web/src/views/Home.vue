<template>
  <div class="home">
    <TopGroundPicture/>
    <SerchBar/>
    <Carousel class="carousel"/>
    <SingleCard class="singleCard"/>
    <NavBar/>
  </div>
</template>

<script>
// @ 连接到 /src
import TopGroundPicture from "@/components/TopGroundPicture.vue";
import SerchBar from "@/components/SerchBar.vue";
import NavBar from "@/components/NavBar.vue";
import Carousel from "@/components/Carousel.vue";
import SingleCard from "@/components/SingleCard.vue";

export default {
  name: "home",
  components: {
    TopGroundPicture,
    SerchBar,
    NavBar,
    Carousel,
    SingleCard
  }
};
</script>

<style scoped>
.singleCard {
  margin-top: 60px;
  margin-bottom: 80px;
  margin-left: 20px;
}

.carousel {
  margin-top: 180px;
}
</style>

