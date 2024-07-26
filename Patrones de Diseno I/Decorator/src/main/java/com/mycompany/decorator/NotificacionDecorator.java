
package com.mycompany.decorator;
import modelo.*;

public abstract class NotificacionDecorator implements Notificacion {
    protected Notificacion notificacionDecorada;

    public NotificacionDecorator(Notificacion notificacionDecorada) {
        this.notificacionDecorada = notificacionDecorada;
    }

    @Override
    public void enviar() {
        notificacionDecorada.enviar();
    }
}