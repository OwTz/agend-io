package com.agendio.api.models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "Agendamentos")
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "descricao")
    String desc;

//    @Column(name = "listaDeusuarios")
//    List<UsuarioModel> listaDeUsuariosEnvolvidos;

//    UsuarioModel creatorUser;
}
