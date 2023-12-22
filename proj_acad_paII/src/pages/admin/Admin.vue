
<script >
import axios from 'axios';
import {onBeforeMount,ref} from 'vue'
  export default {
    setup() {
      const fichas_treino = ref(0);
      onBeforeMount(() =>{

        axios.get('/ficha_de_treino')
        .then(response =>{
          
          fichas_treino.value = response.data;
          fichas_treino.value.forEach(el => {

            if(el.exercicios_list === null){
              
              el.exercicios_list = {
                id:null
              }
            }
            
          });

        }).catch(e =>{

          console.log(e);
        })
      })

      return {fichas_treino}
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

<template>
<br>
<br>
<br>
<section id="services" class="section-bg">
      <div class="container" data-aos="fade-up">

        <header class="section-header">
          <h3>Dashboard</h3>
          
        </header>
        <br>
        <br>
        <br>
        <div class="row justify-content-center">
          
        
          <ul class="nav nav-pills mb-3" id="pills-tab" role="tablist">
          <li class="nav-item" role="presentation">
          
            <button class="nav-link active" id="pills-home-tab" data-bs-toggle="pill" data-bs-target="#pills-home" type="button" role="tab" aria-controls="pills-home" aria-selected="true">Ficha de treinos</button>
          </li>
          <li class="nav-item" role="presentation">
            <button class="nav-link" id="pills-profile-tab" data-bs-toggle="pill" data-bs-target="#pills-profile" type="button" role="tab" aria-controls="pills-profile" aria-selected="false">Equipamentos</button>
          </li>
          <li class="nav-item" role="presentation">
            <button class="nav-link" id="pills-contact-tab" data-bs-toggle="pill" data-bs-target="#pills-contact" type="button" role="tab" aria-controls="pills-contact" aria-selected="false">Contact</button>
          </li>
        </ul>
      
        

        </div>

      </div>
      
   
<div class="tab-content" id="pills-tabContent">
  <div class="tab-pane fade show active" id="pills-home" role="tabpanel" aria-labelledby="pills-home-tab">
    
    <div class="card">
      <table class="table table-striped">
        <tr>
          <th scope="col">id</th>
          <th scope="col">status</th>
          <th scope="col">data_inicio</th>
          <th scope="col">data_cadastro</th>
          <th scope="col">exercicios_list.id</th>
        </tr>
        <tbody v-for="(item, i) in fichas_treino">
          <tr>
            
            <td>{{fichas_treino[i].id  }}</td>
            <td>{{fichas_treino[i].status  }}</td>
            <td>{{fichas_treino[i].data_inicio}}</td>
            <td>{{fichas_treino[i].data_cadastro}}</td>
            <td>{{fichas_treino[i].exercicios_list.id}}</td>
          </tr>
          
      </tbody>
       
      </table>
        </div>
  </div>
  <div class="tab-pane fade" id="pills-profile" role="tabpanel" aria-labelledby="pills-profile-tab">2</div>
  <div class="tab-pane fade" id="pills-contact" role="tabpanel" aria-labelledby="pills-contact-tab">3</div>
</div>
    </section><!-- End Services Section -->

</template>