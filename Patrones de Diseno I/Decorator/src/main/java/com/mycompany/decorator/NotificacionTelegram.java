
package com.mycompany.decorator;
import modelo.*;

public class NotificacionTelegram extends NotificacionDecorator {
    public NotificacionTelegram(Notificacion notificacionDecorada) {
        super(notificacionDecorada);
    }

    @Override
    public void enviar() {
        super.enviar();
        enviarTelegram();
    }

    private void enviarTelegram() {
        System.out.println("Enviando notificación por Telegram.");
    }
}