package com.mycompany.factorymethod;
import modulo.*;


public class TarjetaPremiumFactory extends TarjetaCreditoFactory {
    @Override
    public TarjetaCredito crearTarjeta() {
        return new TarjetaPremium();
    }   
}
