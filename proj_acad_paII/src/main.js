import "bootstrap/dist/css/bootstrap.min.css"
import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
// import cors from 'cors'

// import './assets/main.css'

const app = createApp(App)

// app.use(cors)

app.use(router)

app.mount('#app')


import "bootstrap/dist/js/bootstrap.js"

