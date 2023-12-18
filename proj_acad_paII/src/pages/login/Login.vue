<script setup>
import { ref } from 'vue'

import axios from 'axios';
     
    const input_login = ref('')
    const input_senha = ref('')

   
   
     
      function doLogin(e){
        
        // e.preventDefault();
        // console.log("click!");
        // axios.defaults.headers.post['Access-Control-Allow-Origin'] = '*'
        axios.post('/login', {
          //   headers: {
          //   'Access-Control-Allow-Origin': '*',
         
          // },
            login: this.input_login,
            senha: this.input_senha
          })
          .then((response) => {
            // console.log(response);
            
            console.log(response.data);
            localStorage.setItem("token", response.data);
          }, (error) => {
            console.log(error);
          });

       
      }
  

      


</script>

<template>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
      
       
      
    </nav>
  
    <br/>
    <br/>
    <br/>
    <br/>
    
     <!-- <p>{{input_login}}</p> -->
    
    <form @submit.prevent="doLogin()"  class="container-fluid w-50 ms-auto mt-5"  >
    <div class="mb-3 ">
        <h1 >Logue para acessar o painel</h1>
        <label for="login input" class="form-label">Login</label>
        <input v-model="input_login"  type="text" class="form-control" id="login input" aria-describedby="loginhelp">
        <div id="loginhelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>

  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Senha de acesso</label>
    <input v-model="input_senha" type="password" class="form-control" id="exampleInputPassword1">
  </div>
  <!-- <div class="mb-3 form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div> -->
  <button type="submit" class="btn btn-primary">Entrar</button>
</form>


</template>

<style>
    
</style>