package com.back_end_acad.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.back_end_acad.demo.Domain.Lista_exercicios;
import com.back_end_acad.demo.Repository.Lista_exercicios_repository;

@Service
public class Lista_exercicios_service {

    @Autowired
    private Lista_exercicios_repository repository;

    public void insert(Lista_exercicios lExercicios) {
        repository.save(lExercicios);
    }

    public void update(Lista_exercicios lExercicios) {
        repository.saveAndFlush(lExercicios);
        
    }

    public Lista_exercicios search(Long id) {
        
        Optional<Lista_exercicios> uOptional = repository.findById(id);
        return uOptional.orElse(null);
    }

    public List<Lista_exercicios> list_all() {
        List<Lista_exercicios>uList = repository.findAll();
        return uList;
    }

    
    public void remove(Lista_exercicios lExercicios){
        repository.delete(lExercicios);
    }

}
