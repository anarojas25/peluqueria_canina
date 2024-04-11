
package com.mycompany.peluqueria_canina.logica;

import com.mycompany.peluqueria_canina.persistencia.ControladoraPersistencia;
import java.util.List;

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

    public List<Mascota> traerMascotas() {
        
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controlPersis.traerMascota(num_cliente);
    }

    public void editarMascota(Mascota masco, String nombreMascota, String color, String nombreDuenio, String raza, String telefonoDuenio, String observaciones, String alergico, String atencionEspecial) {
        masco.setNombreMascota(nombreMascota);
        masco.setAlergico(alergico);
        masco.setAtencionEspecial(atencionEspecial);
        masco.setColor(color);
        masco.setRaza(raza);
        masco.setObservaciones(observaciones);
        controlPersis.editarMascota(masco);
        
        Duenio dueno = this.bucarDuenio(masco.getUnDuenio().getIdDuenio());
        dueno.setNombre(nombreDuenio);
        dueno.setTelDuenio(telefonoDuenio);
        
        this.modificarDuenio(dueno);
    }

    private Duenio bucarDuenio(int idDuenio) {
        return controlPersis.traerDuenio(idDuenio);
        
    }

    private void modificarDuenio(Duenio dueno) {
         controlPersis.modificarDuenio(dueno);
    }
    
}
