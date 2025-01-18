package com.example.demo.service;

import com.example.demo.model.Persona;
import com.example.demo.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersonaRepository personaRepository;

    @Override
    public List<Persona> listarPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona crearPersona(String nombre, String apellidos) {
        return personaRepository.save(new Persona(nombre, apellidos));
    }


}
