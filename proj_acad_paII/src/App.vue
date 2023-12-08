<script setup>
import { RouterLink, RouterView } from 'vue-router'
import Home from './pages/home/Home.vue';
import NavbarVue from './components/navbar/Navbar.vue';


</script>

<template >
  <NavbarVue/>
  
  <RouterView />
  <!-- <RouterLink/> -->
</template>

<style src="./App.css" scoped>

</style>
