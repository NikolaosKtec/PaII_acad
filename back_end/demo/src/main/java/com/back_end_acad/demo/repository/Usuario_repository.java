package com.back_end_acad.demo.Repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.back_end_acad.demo.Domain.Usuario;
@Repository
public interface Usuario_repository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByLogin(String login);

  
    
}
