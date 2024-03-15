
package com.mycompany.peluqueria_canina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idDuenio;
    private String nombre;
    private String telDuenio;

    public Duenio() {
    }

    public Duenio(int idDuenio, String nombre, String telDuenio) {
        this.idDuenio = idDuenio;
        this.nombre = nombre;
        this.telDuenio = telDuenio;
    }

    public int getIdDuenio() {
        return idDuenio;
    }

    public void setIdDuenio(int idDuenio) {
        this.idDuenio = idDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelDuenio() {
        return telDuenio;
    }

    public void setTelDuenio(String telDuenio) {
        this.telDuenio = telDuenio;
    }
    
    
}
