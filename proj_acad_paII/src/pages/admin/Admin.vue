
<script >
import axios from 'axios';
import {onBeforeMount,ref} from 'vue'
  export default {
    setup() {
      const fichas_treino = ref(0);
      const usuarios = ref(0);

      let load = false; 
      let load_b = false; 
      onBeforeMount(() =>{
        // FICHA
        axios.get('/ficha_de_treino')
        .then(response =>{
          load = true;
          fichas_treino.value = response.data;
          fichas_treino.value.forEach(el => {

            if(el.exercicios_list === null){
              
              el.exercicios_list = {
                id:null
              }
            }
          });

        }).catch(e =>{
          load = false;
          console.log(e);
        })
        // USERS
        axios.get('/user')
        .then(response =>{
          
          usuarios.value = response.data;
          usuarios.value.forEach(el =>{
            el.senha = '****';
          })



          load_b = true;
        }).catch(e =>{

          load_b = false;
          console.log(e);
        })
        
      })

      return {fichas_treino,usuarios,load,load_b}
    },
    methods:{
      fetch_ficha:()=>{
      
      
       alert('fetch!');
      }
    }
  }

</script>
<style scoped>

@keyframes myAnim {
	0% {
		transform: scale(0.5);
		transform-origin: 50% 0%;
	}

	100% {
		transform: scale(1);
		transform-origin: 50% 0%;
	}
}

div.card{
  animation: myAnim 0.5s linear 0s 1 normal forwards;
} 

</style>


<template src="./admin.html">
    
    
</template>
