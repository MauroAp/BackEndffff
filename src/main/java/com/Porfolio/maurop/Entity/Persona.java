/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio.maurop.Entity;

/**
 *
 * @author Perez Mauro
 */
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import lombok.Getter;
import lombok.Setter;
import java.util.List; 


@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(nullable = false, updatable = false, unique = true)
    private Long id;


    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String sobre_mi;
    private String domicilio;
    private String img;
    private String titulo;

    @JsonIgnoreProperties("persona")
    @OneToMany(cascade = CascadeType.ALL, targetEntity = Estudios.class)
    @JoinColumn(name = "ed_fk", referencedColumnName = "id")
    private List<Estudios> estudiosList;

    @JsonIgnoreProperties("persona")
    @OneToMany(cascade = CascadeType.ALL, targetEntity = Experiencia.class)
    @JoinColumn(name = "ex_fk", referencedColumnName = "id")
    private List<Experiencia> experienciaList;

    @JsonIgnoreProperties("persona")
    @OneToMany(cascade = CascadeType.ALL, targetEntity = Skills.class)
    @JoinColumn(name = "sk_fk", referencedColumnName = "id")
    private List<Skills> skillsList;

    @JsonIgnoreProperties("persona")
    @OneToMany(cascade = CascadeType.ALL, targetEntity = Proyectos.class)
    @JoinColumn(name = "pr_fk", referencedColumnName = "id")
    private List<Proyectos> proyectosList; 

    public Persona(){
    }
    public Persona(Long id, String nombre, String apellido, String telefono, String correo, String sobre_mi,String domicilio, String img, String titulo){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.sobre_mi = sobre_mi;
        this.domicilio = domicilio;
        this.img = img;
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSobre_mi() {
        return sobre_mi;
    }

    public void setSobre_mi(String sobre_mi) {
        this.sobre_mi = sobre_mi;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", sobre_mi='" + sobre_mi + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", img='" + img + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}



