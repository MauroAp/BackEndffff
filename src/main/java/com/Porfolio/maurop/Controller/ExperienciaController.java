/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio.maurop.Controller;


import com.Porfolio.maurop.Entity.Experiencia;
import com.Porfolio.maurop.Service.IExperienciaService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
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

@RequestMapping("/experiencia")
public class ExperienciaController {
    
 @Autowired
    IExperienciaService iexperienciaService;

    @GetMapping("/all")
    public ResponseEntity<List<Experiencia>> getAllExperiencia() {
        List<Experiencia> experiencia =iexperienciaService.findAllExperiencia();
        return new ResponseEntity<>(experiencia, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Experiencia>getExperienciaById(@PathVariable("id") Long id) {
        Experiencia experiencia =iexperienciaService.findExperiencia(id);
        return new ResponseEntity<>(experiencia, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')") */
    @PostMapping("/add")
    public ResponseEntity<Experiencia> addExperiencia (@RequestBody Experiencia experiencia) {
        Experiencia newExperiencia =iexperienciaService.addExperiencia(experiencia);
        return new ResponseEntity<>(newExperiencia, HttpStatus.CREATED);
    }

    /* @PreAuthorize("hasRole('ADMIN')") */
    @PutMapping("/update")
    public ResponseEntity<Experiencia> updateExperiencia (@RequestBody Experiencia experiencia) {
        Experiencia updateExperiencia =iexperienciaService.updateExperiencia(experiencia);
        return new ResponseEntity<>(updateExperiencia, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')")*/
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteExperiencia (@PathVariable("id") Long id) {
       iexperienciaService.deleteExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
