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

    public Skills(){}

    public Skills(Long id, String skill, Integer porcentaje, String img) {
        this.id = id;
        this.skill = skill;
        this.porcentaje = porcentaje;
        this.img = img;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Integer getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
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

