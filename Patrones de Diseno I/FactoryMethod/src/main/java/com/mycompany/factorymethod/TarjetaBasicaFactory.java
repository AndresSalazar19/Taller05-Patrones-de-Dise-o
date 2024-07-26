
package com.mycompany.factorymethod;

import modulo.*;

/**
 *
 * @author asala
 */
public class TarjetaBasicaFactory extends TarjetaCreditoFactory{
    @Override
    public TarjetaCredito crearTarjeta() {
        return new TarjetaBasica();
    }
}
