
package com.mycompany.factorymethod;

import modulo.*;


public class Main {

    public static void main(String[] args) {
        TarjetaCreditoFactory fabrica;
        
        // Dependiendo de las características del cliente, seleccionamos la fábrica adecuada
        fabrica = new TarjetaBasicaFactory(); // ejemplo para un cliente que califica para tarjeta básica
        TarjetaCredito tarjeta = fabrica.crearTarjeta();
        tarjeta.mostrarInformacion();
        
        fabrica = new TarjetaPremiumFactory(); // ejemplo para un cliente que califica para tarjeta premium
        tarjeta = fabrica.crearTarjeta();
        tarjeta.mostrarInformacion();
        
        fabrica = new TarjetaVIPFactory(); // ejemplo para un cliente que califica para tarjeta VIP
        tarjeta = fabrica.crearTarjeta();
        tarjeta.mostrarInformacion();
    }
}
