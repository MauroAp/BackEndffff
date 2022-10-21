/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio.maurop.security.util;

import com.Porfolio.maurop.security.entity.Rol;
import com.Porfolio.maurop.security.enums.RolNombre;
import com.Porfolio.maurop.security.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Perez Mauro
 */
@Component
public class CreateRoles implements CommandLineRunner {

    @Autowired
    RolService rolService;

    @Override
    public void run(String... args) throws Exception {
       /* Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
         Rol rolUser = new Rol(RolNombre.ROLE_USER);
         rolService.save(rolAdmin);
         rolService.save(rolUser);*/
         
    }
}
