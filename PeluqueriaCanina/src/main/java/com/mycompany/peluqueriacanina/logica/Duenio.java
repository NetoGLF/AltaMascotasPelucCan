package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_Duenio;
    
    @Basic 
    private String nombre;
    private String celDuenio;
    
    //Constructor

    public Duenio() {
    }

    public Duenio(int id_Duenio, String nombre, String celDuenio) {
        this.id_Duenio = id_Duenio;
        this.nombre = nombre;
        this.celDuenio = celDuenio;
    }
    
    //Getters y Setters

    public int getId_Duenio() {
        return id_Duenio;
    }

    public void setId_Duenio(int id_Duenio) {
        this.id_Duenio = id_Duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelDuenio() {
        return celDuenio;
    }

    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Duenio{" + "id_Duenio=" + id_Duenio + ", nombre=" + nombre + ", celDuenio=" + celDuenio + '}';
    }
    
    
}
