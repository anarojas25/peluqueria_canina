
package com.mycompany.peluqueria_canina.persistencia;

import com.mycompany.peluqueria_canina.logica.Duenio;
import com.mycompany.peluqueria_canina.logica.Mascota;
import com.mycompany.peluqueria_canina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    DuenioJpaController duenioJPA = new DuenioJpaController();
    MascotaJpaController mascotaJPA = new MascotaJpaController();
    

    public void guardar(Duenio duenio, Mascota masco) {
        
       duenioJPA.create(duenio);
       mascotaJPA.create(masco);
        
    }
    
    public List<Mascota> traerMascotas(){
        
        return mascotaJPA.findMascotaEntities();
                
    }

    public void borrarMascota(int num_cliente) {
        try {
        mascotaJPA.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 

    public Mascota traerMascota(int num_cliente) {
        return mascotaJPA.findMascota(num_cliente);
        
    }

    public void editarMascota(Mascota masco) {
        try {
            mascotaJPA.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traerDuenio(int idDuenio) {
        return duenioJPA.findDuenio(idDuenio);
    }

    public void modificarDuenio(Duenio dueno) {
        try {
            duenioJPA.edit(dueno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
