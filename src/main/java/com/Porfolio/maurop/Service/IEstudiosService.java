/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio.maurop.Service;
import com.Porfolio.maurop.Entity.Estudios;
import com.Porfolio.maurop.Repository.IEstudiosRepository;
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
public class IEstudiosService {
    
 private final IEstudiosRepository iestudiosRepository;

    @Autowired
    public IEstudiosService(IEstudiosRepository iestudiosRepository){
        this.iestudiosRepository = iestudiosRepository;
    }

    public Estudios addEstudio(Estudios estudio) {
        return iestudiosRepository.save(estudio);
    }

    public List<Estudios> findAllEstudios() {
        return iestudiosRepository.findAll();
    }

    public Estudios updateEstudios(Estudios estudio) {
        return iestudiosRepository.save(estudio);
    }

    public void deleteEstudios(Long id) {
        iestudiosRepository.deleteEstudiosById(id);
    }


    public Estudios findEstudiosById(Long id) {
        return iestudiosRepository.findEstudiosById(id).orElseThrow(() -> new UserNotFoundException("El curso de id" + id + "no fue encontrado"));
    }
}

