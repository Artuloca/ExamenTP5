/**
 * La clase EstrategiaRapida implementa la interfaz EstrategiaDeServicio
 * y proporciona la funcionalidad para ejecutar una estrategia de servicio
 * rápida en un restaurante.
 */
package Restaurante.Ejercicio1.Rapido;

import Restaurante.Ejercicio1.EstrategiaDeServicio;

public class EstrategiaRapida implements EstrategiaDeServicio {

    /**
     * Este método ejecuta la estrategia de servicio rápida, imprimiendo
     * un mensaje indicando que se está ejecutando la estrategia rápida.
     */
    @Override
    public void ejecutarEstrategia() {
        System.out.println("Ejecutando estrategia rápida...");
    }
}

