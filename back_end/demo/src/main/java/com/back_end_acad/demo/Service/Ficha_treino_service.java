package com.back_end_acad.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.back_end_acad.demo.Domain.Ficha_treino;
import com.back_end_acad.demo.repository.Ficha_treino_repository;

@Service
public class Ficha_treino_service {

    @Autowired
    private Ficha_treino_repository repository;

    public void insert(Ficha_treino ficha_treino) {
        repository.save(ficha_treino);
    }

    public void update(Ficha_treino ficha_treino) {
        repository.saveAndFlush(ficha_treino);
        
    }

    public Ficha_treino search(Long id) {
        
        Optional<Ficha_treino> uOptional = repository.findById(id);
        return uOptional.orElse(null);
    }

    public List<Ficha_treino> list_all() {
        List<Ficha_treino>uList = repository.findAll();
        return uList;
    }

    
    public void remove(Ficha_treino ficha_treino){
        repository.delete(ficha_treino);
    }
}
