
package com.mycompany.peluqueria_canina.logica;

import com.mycompany.peluqueria_canina.persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMascota, String color, String nombreDuenio, String raza, String telefonoDuenio, String observaciones, String alergico, String atencionEspecial) {
        
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setTelDuenio(telefonoDuenio);
        
        Mascota masco = new Mascota();
        masco.setNombreMascota(nombreMascota);
        masco.setColor(color);
        masco.setRaza(raza);
        masco.setAlergico(alergico);
        masco.setAtencionEspecial(atencionEspecial);
        masco.setObservaciones(observaciones);
        masco.setUnDuenio(duenio);
        
        controlPersis.guardar(duenio, masco);
    }
    
}
