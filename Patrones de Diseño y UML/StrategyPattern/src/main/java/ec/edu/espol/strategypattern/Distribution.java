/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.strategypattern;

import java.util.List;

/**
 *
 * @author Gecko
 */
public class Distribution {
    private EstrategiaTransporte estrategia;

    public Distribution(EstrategiaTransporte estrategia) {
        this.estrategia = estrategia;
    }
    
    public void cambiarEstrategia(EstrategiaTransporte estrategia){
        this.estrategia = estrategia;
    }
    
    public void distribuir(List<String> articulos){
        estrategia.transportar(articulos);
    }
   
}
