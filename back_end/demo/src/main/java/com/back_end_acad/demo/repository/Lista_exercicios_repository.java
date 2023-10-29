package com.back_end_acad.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.back_end_acad.demo.Domain.Lista_exercicios;

public interface Lista_exercicios_repository  extends JpaRepository<Lista_exercicios,Long>{

    
}