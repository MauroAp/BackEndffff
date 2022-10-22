/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio.maurop.Entity;

import java.io.Serializable;
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
@Table(name = "proyectos")
public class Proyectos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String descripcion;
    private String fecha;
    private String img;
    private String github;
    private String proyecto;

    public Proyectos() {
    }

    public Proyectos(String nombre, String descripcion, String fecha, String img, String github, String proyecto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.img = img;
        this.github = github;
        this.proyecto = proyecto;
    }

    
    @Override
    public String toString(){
        return "Proyectos {" +
                "id=" + id + '\'' +
                "nombre=" + nombre + '\'' +
                "descripcion=" + descripcion + '\'' +
                "fecha=" + fecha + '\'' +
                "img=" + img + '\'' +
                "github=" + github + '\'' +
                "proyecto=" + proyecto +  '\'' +
                '}';
    }
}
