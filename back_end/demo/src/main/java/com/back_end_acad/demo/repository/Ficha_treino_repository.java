package com.back_end_acad.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.back_end_acad.demo.Domain.Ficha_treino;
@Repository
public interface Ficha_treino_repository extends JpaRepository<Ficha_treino,Long>{
    
}
