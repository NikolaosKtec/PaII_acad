package com.back_end_acad.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.back_end_acad.demo.Domain.Exercicio;
import com.back_end_acad.demo.Repository.Exercicio_repository;


@Service
public class Exercicio_service {
    
    @Autowired
    private Exercicio_repository repository;

    public void insert(Exercicio exercicio) {
        repository.save(exercicio);
    }

    public void update(Exercicio exercicio) {
        repository.saveAndFlush(exercicio);
        
    }

    public Exercicio search(Long id) {
        
        Optional<Exercicio> uOptional = repository.findById(id);
        return uOptional.orElse(null);
    }

    public List<Exercicio> list_all() {
        List<Exercicio>uList = repository.findAll();
        return uList;
    }

    
    public void remove(Exercicio exercicio){
        repository.delete(exercicio);
    }

}
