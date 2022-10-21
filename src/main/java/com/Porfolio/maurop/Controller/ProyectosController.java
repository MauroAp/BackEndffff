/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio.maurop.Controller;

import com.Porfolio.maurop.Entity.Proyectos;
import com.Porfolio.maurop.Service.IProyectosService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;


/*import org.springframework.security.access.prepost.PreAuthorize;*/


/**
 *
 * @author Perez Mauro
 */

@CrossOrigin(origins = "https://localhost:8080")
@RestController
@Transactional
@RequestMapping("/proyectos")
public class ProyectosController {
    
 @Autowired
    IProyectosService iproyectosService;

    @GetMapping("/all")
    public ResponseEntity<List<Proyectos>> findAllProyectos() {
        List<Proyectos> proyectos = iproyectosService.findAllProyectos();
        return new ResponseEntity<>(proyectos, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Proyectos> findProyecto(@PathVariable("id") Long id) {
        Proyectos proyecto = iproyectosService.findProyecto(id);
        return new ResponseEntity<>(proyecto, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')") */
    @PostMapping("/add")
    public ResponseEntity<Proyectos> addProyecto (@RequestBody Proyectos proyecto) {
        Proyectos newProyecto = iproyectosService.addProyecto(proyecto);
        return new ResponseEntity<>(newProyecto, HttpStatus.CREATED);
    }

    /* @PreAuthorize("hasRole('ADMIN')") */
    @PutMapping("/update")
    public ResponseEntity<Proyectos> updateProyectos (@RequestBody Proyectos skill) {
        Proyectos updateProyectos = iproyectosService.updateProyectos(skill);
        return new ResponseEntity<>(updateProyectos, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')") */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProyecto (@PathVariable("id") Long id) {
        iproyectosService.deleteProyecto(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

