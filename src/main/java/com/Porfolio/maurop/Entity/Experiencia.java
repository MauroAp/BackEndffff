/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio.maurop.Entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author Perez Mauro
 */
@Getter
@Setter
@Entity
@Table(name = "experiencia")
public class Experiencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name = "id", nullable = false)
    private Long id;

    private String cargo;
    private String nombre_empresa;
    private String fecha_inicio;
    private String fecha_fin;
    private String descripcion;

    public Experiencia(){}

    public Experiencia(Long id, String cargo, String nombre_empresa, String fecha_inicio, String fecha_fin, String descripcion){
        this.id = id;
        this.cargo = cargo;
        this.nombre_empresa = nombre_empresa;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString(){
        return "Experiencia{" +
                "id=" + id +
                ",cargo=" + cargo +
                ",nombre_empresa=" + nombre_empresa +
                ",fecha_inicio=" + fecha_inicio +
                ",fecha_fin=" + fecha_fin +
                ",descripcion=" + descripcion + '\'' +
                '}';
    }
}
