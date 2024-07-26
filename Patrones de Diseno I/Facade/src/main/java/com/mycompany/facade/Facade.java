
package com.mycompany.facade;

public class Facade {
    private Operaciones operacionesSubsistema;

    public Facade() {
        this.operacionesSubsistema = new OperacionesSubsistema();
    }

    public void manejarCanalWeb() {
        System.out.println("Manejando Canal Web");
        operacionesSubsistema.operacionA();
        operacionesSubsistema.operacionB();
    }

    public void manejarCanalMovil() {
        System.out.println("Manejando Canal Movil");
        operacionesSubsistema.operacionB();
        operacionesSubsistema.operacionC();
    }

    public void manejarCanalTelefonico() {
        System.out.println("Manejando Canal Telefonico");
        operacionesSubsistema.operacionC();
        operacionesSubsistema.operacionD();
    }
}
