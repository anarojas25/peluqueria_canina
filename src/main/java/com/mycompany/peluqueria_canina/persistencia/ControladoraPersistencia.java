
package com.mycompany.peluqueria_canina.persistencia;

import com.mycompany.peluqueria_canina.logica.Duenio;
import com.mycompany.peluqueria_canina.logica.Mascota;

public class ControladoraPersistencia {
    
    DuenioJpaController duenioJPA = new DuenioJpaController();
    MascotaJpaController mascotaJPA = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        
       duenioJPA.create(duenio);
       mascotaJPA.create(masco);
        
    }
    
    
    
}
