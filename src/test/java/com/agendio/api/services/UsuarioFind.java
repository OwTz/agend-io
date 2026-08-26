package com.agendio.api.services;


import com.agendio.api.mockUsers.MockUsers;
import com.agendio.api.models.UsuarioModel;
import com.agendio.api.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class UsuarioFind {

    @Mock
    private UsuarioRepository usuarioRepository;

    @InjectMocks
    private UsuarioServices usuarioService;

    @Test
    public void deveRetornarUsuarioPorId() {
        List<UsuarioModel> listaDeuUsario = new MockUsers().addNewUsers();
        for(UsuarioModel u: listaDeuUsario){
            usuarioService.addNewUser(u);
            System.out.println("Usuário adicionado: "+u);
        }


    }


}
