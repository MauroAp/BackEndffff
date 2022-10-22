/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio.maurop.Controller;

import com.Porfolio.maurop.Entity.Persona;
import com.Porfolio.maurop.Service.IPersonaService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
/*import org.springframework.security.access.prepost.PreAuthorize;*/



/**
 *
 * @author Perez Mauro
 */
@RestController
@CrossOrigin(origins = "https://localhost:4200")


@RequestMapping("/persona")
public class PersonaController {
    
private final IPersonaService iPersonaService;

    public PersonaController(IPersonaService iPersonaService) {
        this.iPersonaService = iPersonaService;
    }

    @GetMapping("/all")
public ResponseEntity<List<Persona>> getAllPersonas(){
        List<Persona> personas = iPersonaService.findAllPersonas();
        return new ResponseEntity<>(personas, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Persona> getPersonaById(@PathVariable("id") Long id){
       Persona persona = iPersonaService.findPersonaById(id);
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }
    /* @PreAuthorize("hasRole('ADMIN')") */
    @PostMapping("/add")
public ResponseEntity<Persona> addPersona(@RequestBody Persona persona){
        Persona  newPersona = iPersonaService.addPersona(persona);
        return new ResponseEntity<>(newPersona, HttpStatus.CREATED);
    }
    /* @PreAuthorize("hasRole('ADMIN')") */
    @PutMapping("/update")
    public ResponseEntity<Persona> updatePersona(@RequestBody Persona persona){
        Persona  updatePersona = iPersonaService.updatePersona(persona);
        return new ResponseEntity<>(updatePersona, HttpStatus.OK);
    }
    /* @PreAuthorize("hasRole('ADMIN')") */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Persona> deletePersona(@PathVariable("id") Long id){
        iPersonaService.deletePersona(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

