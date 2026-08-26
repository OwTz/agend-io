package com.agendio.api.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "usuarios")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Setter
    @Getter
    @Column(name = "email")
    private String email;

    @Column(name = "nameUser")
    @Setter
    @Getter
    private String nameUser;

    @Column(name = "passwordUser")
    @Setter
    @Getter
    private String passwordUser;

//    @Column(name = "agendamento_id")
//    List<Agendamento> listaDeAgendamentos;

    // Construtor da classe
    public UsuarioModel(String email, String nameUser, String passwordUser) {
        this.email = email;
        this.nameUser = nameUser;
        this.passwordUser = passwordUser;
    }

}
