/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio.maurop.Repository;

import com.Porfolio.maurop.Entity.Estudios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
/**
 *
 * @author Perez Mauro
 */
@Repository
public interface IEstudiosRepository  extends JpaRepository<Estudios, Long> {
    void deleteEstudiosById(Long id);

    Optional<Estudios> findEstudiosById(Long id);
}
