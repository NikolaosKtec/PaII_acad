package com.back_end_acad.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.back_end_acad.demo.Domain.Usuario;

public interface Usuario_repository extends JpaRepository<Usuario, Long> {
    
}
