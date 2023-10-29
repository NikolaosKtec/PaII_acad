package com.back_end_acad.demo.Endpoints;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.back_end_acad.demo.Domain.Usuario;
import com.back_end_acad.demo.Service.Usuario_service;

@RestController
public class Usuario_controller {

    @Autowired
    private Usuario_service service;

    @GetMapping("/")
    public List<Usuario> all(){

        return service.list_all();
    }

    @PostMapping("/login")
    public HttpStatus doLogin(@RequestBody Usuario usuario){

        if (usuario.getId().equals(null)) {
            return HttpStatus.BAD_REQUEST;
        }

        Optional<Usuario> oUser = service.search(usuario.getId());

        if (oUser.isEmpty()) {
            return HttpStatus.NOT_FOUND;
        }

        var user = oUser.get();
        if (usuario.getSenha().equals(user.getSenha())) {
            return HttpStatus.ACCEPTED;
        }else{
            return HttpStatus.BAD_REQUEST;
        }
       
    }
}
