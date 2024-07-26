
package modelo;


public class NotificacionSMS implements Notificacion {
    @Override
    public void enviar() {
        System.out.println("Enviando notificación por SMS.");
    }
}

