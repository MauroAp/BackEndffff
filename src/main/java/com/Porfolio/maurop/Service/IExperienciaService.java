/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio.maurop.Service;
import com.Porfolio.maurop.Entity.Experiencia;
import com.Porfolio.maurop.Repository.IExperienciaRepository;
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
public class IExperienciaService {
    
 private final IExperienciaRepository iExperienciaRepository;

    @Autowired
    public IExperienciaService(IExperienciaRepository iexperienciaRepository) {
        this.iExperienciaRepository = iexperienciaRepository;
    }

    public Experiencia addExperiencia(Experiencia experiencia){
        return iExperienciaRepository.save(experiencia);
    }

    public List<Experiencia> findAllExperiencia(){
        return iExperienciaRepository.findAll();
    }

    public Experiencia updateExperiencia(Experiencia experiencia){
        return iExperienciaRepository.save(experiencia);
    }

    public void deleteExperiencia(Long id){
        iExperienciaRepository.deleteExperienciaById(id);
    }

    public Experiencia findExperiencia(Long id){
        return iExperienciaRepository.findExperienciaById(id)
                .orElseThrow(() -> new UserNotFoundException("La experiencia laboral de id" + id + "no fue encontrada"));
    }
}

