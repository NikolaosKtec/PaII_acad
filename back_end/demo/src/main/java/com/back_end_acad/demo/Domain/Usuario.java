package com.back_end_acad.demo.Domain;


import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Usuario {

    

    public Usuario( String login, String senha, String email, Set<Ficha_treino> ficha_treinos) {
        // Id = null;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.ficha_treinos = ficha_treinos;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(length = 32, nullable = false, unique = true)
    private String login;

    @Column(length = 32, nullable = false)
    private String senha;

    @Column(length = 48, nullable = false)
    private String email;

    @OneToMany(mappedBy="usuario")
    private Set<Ficha_treino> ficha_treinos;

    
}
