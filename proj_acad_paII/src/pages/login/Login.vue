<script setup>
import { ref } from 'vue'

import axios from 'axios';
     
    const input_login = ref('')
    const input_senha = ref('')
    const login_ok = ref(true)
   
   
     
      function doLogin(e){
        
        // e.preventDefault();
        // console.log("click!");
        // axios.defaults.headers.post['Access-Control-Allow-Origin'] = '*'
        axios.post('/login', {
          
            login: this.input_login,
            senha: this.input_senha
          })
          .then((response) => {
            // console.log(response);
            
            console.log(response.data);
            localStorage.setItem("token", response.data);
            
            if (response.data === 'ACCEPTED') {
              this.login_ok = true
              window.location.href = '/admin'
            }else{
              this.login_ok = false
            }
            
          }, (error) => {
            console.log(error);
            this.login_ok = false
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
        <input v-model="input_login"  type="text" class="form-control" id="login input" required>
        <div id="loginhelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>

  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Senha de acesso</label>
    <input v-model="input_senha" type="password" class="form-control" id="exampleInputPassword1" required>
  </div>
  <!-- <div class="mb-3 form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div> -->
  <button type="submit" class="btn btn-primary">Entrar</button>
  <p class="alert alert-danger " role="alert" v-if="login_ok == false">Ops, algo deu errado!</p>
</form>
<br>
<br>
<br>



</template>

<style>
    
</style>