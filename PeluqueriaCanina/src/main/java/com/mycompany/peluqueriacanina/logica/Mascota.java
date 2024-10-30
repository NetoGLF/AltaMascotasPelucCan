package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_Mascota;
    
    @Basic
    private String Nombre;
    private String Raza;
    private String Color;
    private String Alergico;
    private String atencionEspecial;
    private String observaciones;
    
    @OneToOne
    private Duenio unDuenio;

    public Mascota() {
    }

    public Mascota(int id_Mascota, String Nombre, String Raza, String Color, String Alergico, String atencionEspecial, String observaciones, Duenio unDuenio) {
        this.id_Mascota = id_Mascota;
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.Color = Color;
        this.Alergico = Alergico;
        this.atencionEspecial = atencionEspecial;
        this.observaciones = observaciones;
        this.unDuenio = unDuenio;
    }

    public int getId_Mascota() {
        return id_Mascota;
    }

    public void setId_Mascota(int id_Mascota) {
        this.id_Mascota = id_Mascota;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getAlergico() {
        return Alergico;
    }

    public void setAlergico(String Alergico) {
        this.Alergico = Alergico;
    }

    public String getAtencionEspecial() {
        return atencionEspecial;
    }

    public void setAtencionEspecial(String atencionEspecial) {
        this.atencionEspecial = atencionEspecial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Duenio getUnDuenio() {
        return unDuenio;
    }

    public void setUnDuenio(Duenio unDuenio) {
        this.unDuenio = unDuenio;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id_Mascota=" + id_Mascota + ", Nombre=" + Nombre + ", Raza=" + Raza + ", Color=" + Color + ", Alergico=" + Alergico + ", atencionEspecial=" + atencionEspecial + ", observaciones=" + observaciones + ", unDuenio=" + unDuenio + '}';
    }
    
    

}
