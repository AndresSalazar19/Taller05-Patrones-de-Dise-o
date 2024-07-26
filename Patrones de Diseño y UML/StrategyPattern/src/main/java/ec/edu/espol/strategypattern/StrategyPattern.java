/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.strategypattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gecko
 */
public class StrategyPattern {

    public static void main(String[] args) {
        List<String> articulos = new ArrayList<>();
        EstrategiaTransporte estrategia1 = new TransporteAereo();
        EstrategiaTransporte estrategia2 = new TransporteFerrea();
        Distribution distribucion = new Distribution(estrategia1);
        distribucion.distribuir(articulos);
        distribucion.cambiarEstrategia(estrategia2);
        distribucion.distribuir(articulos);
    }
}
