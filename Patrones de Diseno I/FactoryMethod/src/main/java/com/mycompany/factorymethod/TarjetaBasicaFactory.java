
package com.mycompany.factorymethod;

import modulo.*;


public class TarjetaBasicaFactory extends TarjetaCreditoFactory{
    @Override
    public TarjetaCredito crearTarjeta() {
        return new TarjetaBasica();
    }
}
