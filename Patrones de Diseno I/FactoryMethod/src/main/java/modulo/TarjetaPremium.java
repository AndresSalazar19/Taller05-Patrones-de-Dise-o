package modulo;


public class TarjetaPremium extends TarjetaCredito {
    public TarjetaPremium() {
        this.costoAnual = 100;
        this.limiteCredito = 5000;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Tarjeta Premium: Costo Anual = " + costoAnual + ", Límite de Crédito = " + limiteCredito);
    }
}