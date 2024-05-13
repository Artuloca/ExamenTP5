/**
 * La clase RestauranteRapido implementa la interfaz Restaurante
 * y proporciona la funcionalidad para describir un restaurante de servicio rápido.
 */
package Restaurante.Ejercicio1.Rapido;

import Restaurante.Ejercicio1.Restaurante;

public class RestauranteRapido implements Restaurante {

    /**
     * Este método imprime un mensaje que describe el restaurante como
     * un "Restaurante de servicio rápido".
     */
    @Override
    public void describir() {
        System.out.println("Restaurante de servicio rápido");
    }
}


