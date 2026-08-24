package com.agendio.api.controller;


import com.agendio.api.models.TravelAgendamentos;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/travelagendamentos", produces =  MediaType.APPLICATION_JSON_VALUE)
public class TravelAgendamentosController {


    @PostMapping
    public void makeTravelRequest (@RequestBody TravelAgendamentos travelRequest) {

    };

}
