/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio.maurop.Service;
import com.Porfolio.maurop.Entity.Proyectos;
import com.Porfolio.maurop.Repository.IProyectosRepository;
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
public class IProyectosService {
    
 private final IProyectosRepository iproyectosRepository;

    @Autowired
    public IProyectosService(IProyectosRepository iproyectosRepository) {
        this.iproyectosRepository = iproyectosRepository;
    }

    public Proyectos addProyecto(Proyectos proyecto) {
        return iproyectosRepository.save(proyecto);
    }

    public List<Proyectos> findAllProyectos() {
        return iproyectosRepository.findAll();
    }

    public Proyectos updateProyectos(Proyectos proyecto) {
        return iproyectosRepository.save(proyecto);
    }

    public void deleteProyecto(Long id) {
        iproyectosRepository.deleteProyectoById(id);
    }


    public Proyectos findProyecto(Long id) {
        return iproyectosRepository.findProyectoById(id).orElseThrow(() -> new UserNotFoundException("El proyecto de id" + id + "no fue encontrado"));
    }
}
