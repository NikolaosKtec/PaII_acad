package com.back_end_acad.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.back_end_acad.demo.Domain.Exercicio;
@Repository
public interface Exercicio_repository  extends JpaRepository<Exercicio,Long> {

    
} 