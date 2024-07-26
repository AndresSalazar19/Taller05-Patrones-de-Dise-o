
package com.mycompany.decorator;
import modelo.*;

public class NotificacionSignal extends NotificacionDecorator {
    public NotificacionSignal(Notificacion notificacionDecorada) {
        super(notificacionDecorada);
    }

    @Override
    public void enviar() {
        super.enviar();
        enviarSignal();
    }

    private void enviarSignal() {
        System.out.println("Enviando notificación por Signal.");
    }
}