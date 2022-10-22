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
@Entity

@Table(name = "estudios")
public class Estudios implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String lugar;
    private String fecha_inicio;
    private String fecha_fin;
    private String titulo;
    private String img;
    private String descripcion;

    public Estudios() {
    }

    public Estudios(String lugar, String fecha_inicio, String fecha_fin, String titulo, String img, String descripcion) {
        this.lugar = lugar;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.titulo = titulo;
        this.img = img;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Override
    public String toString(){
        return "Estudios {" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", lugar=" + lugar + '\'' +
                ", fecha_inicio=" + fecha_inicio + '\'' +
                ", fecha_fin=" + fecha_fin + '\'' +
                ", img=" + img + '\'' +
                ", descripcion=" + descripcion + '\'' +
                '}';
    }
}
