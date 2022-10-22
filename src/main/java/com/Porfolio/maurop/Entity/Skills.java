/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio.maurop.Entity;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Perez Mauro
 */

@Entity
@Getter
@Setter
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String skill;
    private Integer porcentaje;
    private String img;

    public Skills() {
    }

    public Skills(String skill, Integer porcentaje, String img) {
        this.skill = skill;
        this.porcentaje = porcentaje;
        this.img = img;
    }

    
    @Override
    public String toString() {
        return "Skills{" +
                "id=" + id +
                ", skill='" + skill + '\'' +
                ", porcentaje=" + porcentaje +
                ", img='" + img + '\'' +
                '}';
    }
}

