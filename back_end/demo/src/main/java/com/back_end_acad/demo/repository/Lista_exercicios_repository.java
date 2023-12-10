package com.back_end_acad.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.back_end_acad.demo.Domain.Lista_exercicios;
@Repository
public interface Lista_exercicios_repository  extends JpaRepository<Lista_exercicios,Long>{

    
}