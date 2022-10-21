/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio.maurop.Service;
import com.Porfolio.maurop.Entity.Skills;
import com.Porfolio.maurop.Repository.ISkillsRepository;
import com.Porfolio.maurop.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
/**
 *
 * @author Perez Mauro
 */
@Service
@Transactional
public class ISkillsService {
    
 private final ISkillsRepository iskillsRepository;

    @Autowired
    public ISkillsService(ISkillsRepository iskillsRepository) {
        this.iskillsRepository = iskillsRepository;
    }

    public Skills addSkill(Skills skill) {
        return iskillsRepository.save(skill);
    }

    public List<Skills> findAllSkills() {
        return iskillsRepository.findAll();
    }

    public Skills updateSkills(Skills skills) {
        return iskillsRepository.save(skills);
    }

    public void deleteSkill(Long id) {
        iskillsRepository.deleteSkillById(id);
    }


    public Skills findSkillById(Long id) {
        return iskillsRepository.findSkillById(id).orElseThrow(() -> new UserNotFoundException("La habilidad de id" + id + "no fue encontrada"));
    }
}

