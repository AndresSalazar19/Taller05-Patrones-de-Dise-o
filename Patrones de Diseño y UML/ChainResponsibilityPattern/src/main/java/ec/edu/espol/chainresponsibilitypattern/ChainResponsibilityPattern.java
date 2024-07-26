/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.chainresponsibilitypattern;

/**
 *
 * @author Gecko
 */
public class ChainResponsibilityPattern {

    public static void main(String[] args) {
        Solicitud solicitud1 = new Solicitud();
        Gerente gerente = new Gerente();
        Asistente asistente = new Asistente();
        gerente.establecerSiguiente(asistente);
        asistente.manejarSolicitud(solicitud1);
    }
}
