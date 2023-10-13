
<script>
import { RouterLink, RouterView } from 'vue-router'
export default {
    name : 'Home',
}
</script>

<template>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <img src="src\assets\rectangle_sm.png" alt="" width="30" height="24" class="d-inline-block align-text-top">
    <!-- <a class="navbar-brand" href="#">Navbar</a> -->
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
      <div class="navbar-nav">
        <a class="nav-link" href="#"><RouterLink to="/">Home</RouterLink></a>
        <a class="nav-link" href="#"><RouterLink to="/login">login</RouterLink></a>
        <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
      </div>
    </div>
  </div>
</nav>

    <div class="container-fluid">
    
      
    
    <div  class="row">
        <h1>Bem-vindo à Aquarius Fitness</h1>
        <img class="w-25" src="src\assets\rectangle_lg.jpg" alt="Logo da Academia Aquarius Fitness">
        <img class="w-25" src="src\assets\rectangle_lg.jpg" alt="Logo da Academia Aquarius Fitness">
        <img class="w-25" src="src\assets\rectangle_lg.jpg" alt="Logo da Academia Aquarius Fitness">
        
    </div>

    <div id="plans" class="">
        <h2>Nossos Planos</h2>
        <p>Oferecemos uma variedade de planos para atender às suas necessidades.</p>
        <!-- Adicione mais detalhes sobre os planos aqui -->
    </div>

    <div id="classes" class="">
        <h2>Nossas Aulas</h2>
        <p>Oferecemos uma variedade de aulas para ajudá-lo a alcançar seus objetivos de fitness.</p>
        <!-- Adicione mais detalhes sobre as aulas aqui -->
    </div>

    <div id="contact" class="">
        <h2>Contato</h2></div>

    <div class="container">
        <p>Endereço: R. Boa Vista - Nordeste, Natal - RN, 59042-330</p>
        <p>Telefone: (84) 98103-4622</p>
        <p>Email: contato@aquariussfitness.com.br</p>
    </div>
    <footer class="">
        <p>&copy; 2023 Aquariuss Fitness. Todos os direitos reservados.</p>
        <div class="row">
            <div class="col-3 ">
                <a class="" href="https://www.instagram.com/aquariusfitness20/"><img class="w-25" src="src\assets\instagram_ico.svg" alt=""></a>
            </div>
            <div class="col-3">
                <a class="" href="https://www.facebook.com/people/Academia-Aquarius-Fitness/100057185241175/"><img class="w-25" src="src\assets\facebook_ico.svg" alt=""></a>
            </div>
        </div>
    </footer>

    <!-- Resto do conteúdo do site aqui -->

   

    </div>
</template>
<style scoped>
   
</style>