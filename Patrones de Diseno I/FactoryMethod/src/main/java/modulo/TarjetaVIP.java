package modulo;


public class TarjetaVIP extends TarjetaCredito {
    public TarjetaVIP() {
        this.costoAnual = 200;
        this.limiteCredito = 10000;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Tarjeta VIP: Costo Anual = " + costoAnual + ", Límite de Crédito = " + limiteCredito);
    }
}