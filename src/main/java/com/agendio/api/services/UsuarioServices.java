package com.agendio.api.services;


import com.agendio.api.models.UsuarioModel;
import com.agendio.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServices {

    @Autowired
    private UsuarioRepository repo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<UsuarioModel> findAllUsers(){
        try {
            return repo.findAll();
        } catch (Exception e){
            return new ArrayList<UsuarioModel>(null);
        }
    }


    public UsuarioModel addNewUser(UsuarioModel u){
        String encryptPass = passwordEncoder.encode(u.getPasswordUser());
        u.setPasswordUser(encryptPass);
        return repo.save(u);
    }

}
