package com.agendio.api.controller;


import com.agendio.api.models.UsuarioModel;
import com.agendio.api.services.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping(value = "/usuarios", produces = MediaType.APPLICATION_JSON_VALUE)
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

    @GetMapping("/{id}")
    UsuarioModel findUserById(@PathVariable Long id){
        return service.findUserById(id).orElseThrow() ;
    }

}
