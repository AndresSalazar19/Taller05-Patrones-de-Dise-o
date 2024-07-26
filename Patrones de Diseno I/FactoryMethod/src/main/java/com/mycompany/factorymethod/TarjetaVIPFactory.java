

package com.mycompany.factorymethod;
import modulo.*;


public class TarjetaVIPFactory extends TarjetaCreditoFactory{
    @Override
    public TarjetaCredito crearTarjeta() {
        return new TarjetaVIP();
    }   
}
