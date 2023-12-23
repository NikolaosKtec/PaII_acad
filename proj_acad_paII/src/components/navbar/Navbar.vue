
<script>
export default {
  data () {
            return {};
        },
}
</script>

<template>
   
  <!-- ======= Header ======= -->
  <header id="header" class="fixed-top d-flex align-items-center">
    <div class="container d-flex justify-content-between">

      <div class="position-absolute start-0">
        <!-- Uncomment below if you prefer to use an text logo -->
        <!-- <h1><a href="index.html">NewBiz</a></h1> -->
        <router-link to="/"><img src="../../assets/aquarius-logo.jpeg" alt="" class="img-fluid"></router-link>
      </div>

      <nav id="navbar" class="m-auto navbar">
        <ul>
          <li><router-link to="/">Home</router-link></li> 
          <!-- link -->
          <li><router-link to="/admin">Área do admin</router-link></li>
          <li><a class="nav-link scrollto" href="#services">Serviços</a></li>
          <!-- <li><a class="nav-link scrollto " href="#portfolio">Portfolio</a></li> -->
         
         
          <li><a class="nav-link scrollto" href="">---</a></li>
        </ul>
        
      </nav><!-- .navbar -->

    </div>
  </header><!-- #header -->
</template>

