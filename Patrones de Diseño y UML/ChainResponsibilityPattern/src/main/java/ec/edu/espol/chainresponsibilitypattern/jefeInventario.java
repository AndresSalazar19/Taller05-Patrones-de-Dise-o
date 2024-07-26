/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.chainresponsibilitypattern;

/**
 *
 * @author Gecko
 */
public class jefeInventario implements Manejador {
    
    Manejador manejador;
    
    @Override
    public void establecerSiguiente(Manejador manejador) {
        this.manejador = manejador;
    }

    @Override
    public void manejarSolicitud(Solicitud solicitud) {
        // manejar solicitud;
    }
    
}
