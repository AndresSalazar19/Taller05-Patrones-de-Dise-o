
package com.mycompany.decorator;
import modelo.*;

public class NotificacionWire extends NotificacionDecorator {
    public NotificacionWire(Notificacion notificacionDecorada) {
        super(notificacionDecorada);
    }

    @Override
    public void enviar() {
        super.enviar();
        enviarWire();
    }

    private void enviarWire() {
        System.out.println("Enviando notificación por Wire.");
    }
}