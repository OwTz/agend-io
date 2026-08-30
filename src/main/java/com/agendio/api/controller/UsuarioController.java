package com.agendio.api.controller;


import com.agendio.api.models.UsuarioModel;
import com.agendio.api.services.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

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
        return service.findUserById(id) ;
    }

    @DeleteMapping("/{id}")
    UsuarioModel deleteUserById(@PathVariable  Long id){
            UsuarioModel u = findUserById(id);
            service.deleteUserById(id);
            return u;
    }

    @PutMapping("/{id}")
    UsuarioModel fullUpdateUser(@PathVariable("id") long id, @RequestBody UsuarioModel u){
        UsuarioModel ufind = findUserById(id);
        ufind.setNameUser(u.getNameUser());
        ufind.setEmail(u.getEmail());
        return service.addNewUser(ufind);
    }

    @PatchMapping("/{id}")
    public UsuarioModel incrementUpdate(@PathVariable("id") long id, @RequestBody UsuarioModel u){
       UsuarioModel ufind = service.findUserById(id);
        ufind.setNameUser(Optional.ofNullable(u.getNameUser()).orElse(ufind.getNameUser()));
       return service.addNewUser(ufind);
    }

}
