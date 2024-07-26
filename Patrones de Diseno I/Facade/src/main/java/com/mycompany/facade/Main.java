

package com.mycompany.facade;

public class Main {

   public static void main(String[] args) {
        Facade facade = new Facade();

        // Interacciones simplificadas con el sistema a través de la fachada
        facade.manejarCanalWeb();
        facade.manejarCanalMovil();
        facade.manejarCanalTelefonico();
    }
}

