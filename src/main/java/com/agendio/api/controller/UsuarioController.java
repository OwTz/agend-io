package com.agendio.api.controller;


import com.agendio.api.models.UsuarioModel;
import com.agendio.api.services.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioServices service;

    @GetMapping("")
    List<UsuarioModel> allUsers(){
        return service.findAllUsers();
    }

    @PostMapping("")
    UsuarioModel addNewUser(@RequestBody UsuarioModel u){
        service.addNewUser(u);
        return u;
    }



}
