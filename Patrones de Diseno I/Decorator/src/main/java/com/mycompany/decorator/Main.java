/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decorator;
import modelo.*;
/**
 *
 * @author asala
 */
public class Main {
    public static void main(String[] args) {
        // Crear una notificación básica
        Notificacion notificacionBase = new NotificacionSMS();

        // Agregar otros decoradores a la notificación base
        Notificacion notificacion = new NotificacionEmail();
        notificacion = new NotificacionWhatsApp(notificacion);
        notificacion = new NotificacionSignal(notificacion);
        notificacion = new NotificacionWire(notificacion);
        notificacion = new NotificacionTelegram(notificacion);

        // Enviar notificaciones a través de todos los canales configurados
        notificacionBase.enviar();
        notificacion.enviar();
    }
}