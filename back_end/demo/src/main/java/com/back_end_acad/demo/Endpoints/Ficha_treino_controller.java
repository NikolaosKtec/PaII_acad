package com.back_end_acad.demo.Endpoints;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.back_end_acad.demo.Domain.Ficha_treino;
import com.back_end_acad.demo.Domain.Status;


import com.back_end_acad.demo.Service.Ficha_treino_service;
@RestController
public class Ficha_treino_controller {

    @Autowired
    private Ficha_treino_service fTreino_service;


  @GetMapping("/ficha_de_treino")
  public List<Ficha_treino> all() {
    
    var lFicha = fTreino_service.list_all();

    return lFicha;
  }
  

  @PostMapping("/ficha_de_treino")
  public HttpStatus newFicha_de_treino(@RequestBody Ficha_treino ficha_treino) {
     
    // Usuario usuario = ficha_treino.getUsuario();

    // if (usuario.equals(null)) {
    //     return HttpStatus.BAD_REQUEST;
    // }

    fTreino_service.insert(ficha_treino);

    return HttpStatus.CREATED;
  }

  // Single item
  @GetMapping("/ficha_de_treino/{id}")
  public Ficha_treino one(@PathVariable Long id) {
    
   Optional<Ficha_treino> oFicha_treino = fTreino_service.search(id);

  //  if (oFicha_treino.isEmpty()) {
  //       return "HttpStatus.NOT_FOUND";
  //  }

   return oFicha_treino.get();
  }

  @PutMapping("/ficha_de_treino/{id}")
  public HttpStatus replaceFicha_de_treino(@RequestBody Ficha_treino fTreino, @PathVariable Long id) {

    var oFtreino = fTreino_service.search(id);

    if (oFtreino.isEmpty()) {
        return HttpStatus.NOT_FOUND;
    }
    
    fTreino_service.update(fTreino);
    return HttpStatus.OK;
}

  @PutMapping("/employees/{id}")
  public HttpStatus cancelFicha_de_treino(@PathVariable Long id) {

    var oFtreino = fTreino_service.search(id);

    if (oFtreino.isEmpty()) {
        return HttpStatus.NOT_FOUND;
    }
    var fTreino = oFtreino.get();

    if(fTreino.cancel()){
        return HttpStatus.OK;
    }else{
        return HttpStatus.ALREADY_REPORTED;
    }
  }
  // so deleta se ja estiver cancelado
  @DeleteMapping("/employees/{id}")
  public HttpStatus deleteFicha_de_treino(@PathVariable Long id) {

    var oFtreino = fTreino_service.search(id);

    if (oFtreino.isEmpty()) {
        return HttpStatus.NOT_FOUND;
    }
    var fTreino = oFtreino.get();

    if(fTreino.getStatus().equals(Status.CANCELADO)){
        fTreino_service.remove(fTreino);
        return HttpStatus.ACCEPTED;
    }else{
        return HttpStatus.BAD_REQUEST;
    }
  }

}
