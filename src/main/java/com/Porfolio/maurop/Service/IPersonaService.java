/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio.maurop.Service;

import com.Porfolio.maurop.Entity.Persona;
import com.Porfolio.maurop.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Perez Mauro
 */
@Service

public class IPersonaService {
    
 private final IPersonaRepository iPersonaRepository;

    @Autowired
    public IPersonaService(IPersonaRepository ipersonaRepository) {
        this.iPersonaRepository = ipersonaRepository;
    }

    public Persona addPersona(Persona persona){
        return iPersonaRepository.save(persona);
    }

    public List<Persona> findAllPersonas(){
        return iPersonaRepository.findAll();
    }

    public Persona updatePersona(Persona persona){
        return iPersonaRepository.save(persona);
    }
    
    public void deletePersona(Long id){
        iPersonaRepository.deletePersonaById(id);
    }

    public Persona findPersonaById(Long id) {
        return iPersonaRepository.findPersonaById(id);
    }

}

