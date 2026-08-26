package com.agendio.api.mockUsers;

import com.agendio.api.models.UsuarioModel;

import java.util.List;


public class MockUsers {
   public List<UsuarioModel> addNewUsers(){
        UsuarioModel u1 = new UsuarioModel("teste1@gmail.com","Usuario teste 1","123123").setId(1);
        UsuarioModel u2 = new UsuarioModel("teste2@gmail.com","Usuario teste 2","123123");
        UsuarioModel u3 = new UsuarioModel("teste3@gmail.com","Usuario teste 3","123123");

        return List.of(u1, u2, u3);
    }
}
