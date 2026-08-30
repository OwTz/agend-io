package com.agendio.api.models;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.List;

@Data
public class TravelAgendamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Agendamento agendamento;

    @ManyToOne
    UsuarioModel userCreator;


    List<UsuarioModel> usuariosInseridos;
}
