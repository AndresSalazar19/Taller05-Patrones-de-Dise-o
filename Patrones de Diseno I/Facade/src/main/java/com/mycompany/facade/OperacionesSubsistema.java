
package com.mycompany.facade;



public class OperacionesSubsistema implements Operaciones {
    @Override
    public void operacionA() {
        System.out.println("Ejecutando operación A.");
    }

    @Override
    public void operacionB() {
        System.out.println("Ejecutando operación B.");
    }

    @Override
    public void operacionC() {
        System.out.println("Ejecutando operación C.");
    }

    @Override
    public void operacionD() {
        System.out.println("Ejecutando operación D.");
    }
}