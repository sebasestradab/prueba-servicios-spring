package com.example.demo.controller;

import com.example.demo.model.Persona;
import com.example.demo.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/persona")
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

//    public PersonaController(IPersonaService personaService) {
//        this.personaService = personaService;
//    }

    @GetMapping("/listarPersonas")
    public ResponseEntity<List<Persona>> listarPersonas(){
//        return ResponseEntity.ok(List.of(new Persona(1L, "Juan", "Perez")));
        return ResponseEntity.ok(personaService.listarPersonas());

    }
}
