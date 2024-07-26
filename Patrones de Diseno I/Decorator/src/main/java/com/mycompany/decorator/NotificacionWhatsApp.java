
package com.mycompany.decorator;
import modelo.*;

public class NotificacionWhatsApp extends NotificacionDecorator {
    public NotificacionWhatsApp(Notificacion notificacionDecorada) {
        super(notificacionDecorada);
    }

    @Override
    public void enviar() {
        super.enviar();
        enviarWhatsApp();
    }

    private void enviarWhatsApp() {
        System.out.println("Enviando notificación por WhatsApp.");
    }
}
