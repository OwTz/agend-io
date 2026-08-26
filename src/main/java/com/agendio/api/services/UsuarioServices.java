package com.agendio.api.services;


import com.agendio.api.models.UsuarioModel;
import com.agendio.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServices {

    @Autowired
    private UsuarioRepository repo;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public List<UsuarioModel> findAllUsers(){
            return repo.findAll();
    }


    public UsuarioModel addNewUser(UsuarioModel u){
        String encryptPass = passwordEncoder.encode(u.getPasswordUser());
        u.setPasswordUser(encryptPass);
        return repo.save(u);
    }

    public Optional<UsuarioModel> findUserById(Long id){
        return repo.findById(id);
    }

}
