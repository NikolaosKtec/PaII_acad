package com.back_end_acad.demo.Endpoints;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.back_end_acad.demo.Domain.Usuario;
import com.back_end_acad.demo.Domain.dto.user_dto;
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
    public HttpStatus doLogin(@RequestBody user_dto dUser_dto){
        // System.out.println(dUser_dto);
        var usuario = service.search_by_login(dUser_dto.login());
       
        // System.out.println(usr.getEmail());
        if (!(usuario.isPresent())) {
            return HttpStatus.NOT_FOUND;
        }

        if (usuario.get().getSenha().equals(dUser_dto.senha())) {
            return HttpStatus.ACCEPTED;
        }else{
            return HttpStatus.BAD_REQUEST;
        }

    //    return HttpStatus.ACCEPTED;
    }
}
