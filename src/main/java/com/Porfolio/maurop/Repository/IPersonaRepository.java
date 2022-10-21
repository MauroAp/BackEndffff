/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio.maurop.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Porfolio.maurop.Entity.Persona;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Perez Mauro
 */
@Repository

public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    void deletePersonaById(Long id);

    Persona  findPersonaById(Long id);
}

