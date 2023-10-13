<script>
import { ref } from 'vue'
export default {
   data(){
    const text = ref('ola')
    

    function doLogin(){
        alert(text.value)
    }
    

    
    // expose the ref to the template
    return {
      text,doLogin
    }
   }
}

</script>

<template>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
      
        <h1 class="m-auto">Logue para acessar painel</h1>
      
    </nav>
    <br/>
    <br/>
    <br/>
    <br/>
    <form class="container-fluid w-50 ms-auto mt-5" >
          <div class="mb-3 ">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input   type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1">
  </div>
  <div class="mb-3 form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button v-on:click="doLogin" type="submit" class="btn btn-primary">Entrar</button>
</form>


</template>

<style>
    
</style>