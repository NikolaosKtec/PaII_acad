package com.back_end_acad.demo.Service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.back_end_acad.demo.Domain.Usuario;
import com.back_end_acad.demo.Repository.Usuario_repository;

@Service
public class Usuario_service {
    
    @Autowired
    private Usuario_repository repository;

    public void insert(Usuario usuario) {
        repository.save(usuario);
    }

    public void update(Usuario usuario) {
        repository.saveAndFlush(usuario);
        
    }

    public Optional<Usuario> search(Long id) {
        
        Optional<Usuario> uOptional = repository.findById(id);
        return uOptional;
    }
    public Optional<Usuario> search_by_login(String login) {
        
        Optional<Usuario> uOptional = repository.findByLogin(login);
        return uOptional;
    }

    public List<Usuario> list_all() {
        List<Usuario>uList = repository.findAll();
        return uList;
    }

    public void remove(Usuario usuario){
        repository.delete(usuario);
    }

    
}
