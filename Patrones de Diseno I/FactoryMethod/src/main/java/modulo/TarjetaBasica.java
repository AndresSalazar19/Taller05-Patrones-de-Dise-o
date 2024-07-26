package modulo;


public class TarjetaBasica extends TarjetaCredito {
    public TarjetaBasica() {
        this.costoAnual = 50;
        this.limiteCredito = 1000;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Tarjeta Básica: Costo Anual = " + costoAnual + ", Límite de Crédito = " + limiteCredito);
    }
}