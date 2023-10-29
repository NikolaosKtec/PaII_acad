package com.back_end_acad.demo.Domain;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Ficha_treino {
    
    public Ficha_treino(Status status, LocalDate data_inicio, LocalDate data_cadastro, Usuario usuario) {
        this.status = status;
        this.data_inicio = data_inicio;
        this.data_cadastro = data_cadastro;
        this.usuario = usuario;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column
    private LocalDate data_inicio;

    @Column
    private LocalDate data_cadastro;

    @ManyToOne
    @JoinColumn (nullable=false)
    @JsonBackReference
    private Usuario usuario;

    @OneToOne(mappedBy = "ficha_treino" ,optional=false)
    @JsonManagedReference
    private Lista_exercicios exercicios_list;

    
    // muda o status da ficha para INATIVO
    public void inactivate (){
        status = Status.INATIVO;
    }
    
    // ativa a ficha de treino se não estiver cancelado
    public boolean activate(){
        if( !status.equals(Status.CANCELADO)){
            status = Status.ATIVO;
            return true;
        }
        return false;
    }

    public boolean cancel() {

        if( status.equals(Status.CANCELADO)){
            return false;
        }
        status = Status.CANCELADO;
        return true;
    }
}

