
package modelo;


public class NotificacionEmail implements Notificacion {
    @Override
    public void enviar() {
        System.out.println("Enviando notificación por Email.");
    }
}
