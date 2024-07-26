/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espol.chainresponsibilitypattern;

/**
 *
 * @author Gecko
 */
public interface Manejador {
    
    public void establecerSiguiente(Manejador manejador);
    public void manejarSolicitud(Solicitud solicitud);
}
