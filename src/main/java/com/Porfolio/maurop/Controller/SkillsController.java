/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio.maurop.Controller;
import com.Porfolio.maurop.Entity.Skills;
import com.Porfolio.maurop.Service.ISkillsService;
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
@CrossOrigin(origins = "https://localhost:4200")
@RestController

@RequestMapping("/skills")
public class SkillsController {
    
 @Autowired
    ISkillsService iskillsService;

    @GetMapping("/all")
    public ResponseEntity<List<Skills>> findAllSkills() {
        List<Skills> skills = iskillsService.findAllSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Skills> findSkillsById(@PathVariable("id") Long id) {
        Skills skills = iskillsService.findSkillById(id);
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')") */
    @PostMapping("/add")
    public ResponseEntity<Skills> addSkill(@RequestBody Skills skills) {
        Skills newSkill = iskillsService.addSkill(skills);
        return new ResponseEntity<>(newSkill, HttpStatus.CREATED);
    }

    /* @PreAuthorize("hasRole('ADMIN')") */
    @PutMapping("/update")
    public ResponseEntity<Skills> updateSkills(@RequestBody Skills skill) {
        Skills updateSkills = iskillsService.updateSkills(skill);
        return new ResponseEntity<>(updateSkills, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')") */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSkill(@PathVariable("id") Long id) {
        iskillsService.deleteSkill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

