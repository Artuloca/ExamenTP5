/**
 * La clase EstrategiaDeLujo implementa la interfaz EstrategiaDeServicio
 * y proporciona la funcionalidad para ejecutar una estrategia de servicio
 * de lujo en un restaurante.
 */
package Restaurante.Ejercicio1.DeLujo;

import Restaurante.Ejercicio1.EstrategiaDeServicio;

public class EstrategiaDeLujo implements EstrategiaDeServicio {

    /**
     * Este método ejecuta la estrategia de servicio de lujo, imprimiendo
     * un mensaje indicando que se está ejecutando la estrategia de lujo.
     */
    @Override
    public void ejecutarEstrategia() {
        System.out.println("Ejecutando estrategia de lujo...");
    }
}

