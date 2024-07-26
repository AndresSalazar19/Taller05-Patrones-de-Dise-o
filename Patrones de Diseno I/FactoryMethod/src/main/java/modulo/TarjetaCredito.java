package modulo;


public abstract class TarjetaCredito {
    protected double costoAnual;
    protected double limiteCredito;

    public double getCostoAnual() {
        return costoAnual;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public abstract void mostrarInformacion();
}

