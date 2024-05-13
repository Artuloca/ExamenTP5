/**
 * La clase RestauranteDeLujo implementa la interfaz Restaurante
 * y proporciona la funcionalidad para describir un restaurante de lujo.
 */
package Restaurante.Ejercicio1.DeLujo;

import Restaurante.Ejercicio1.Restaurante;

public class RestauranteDeLujo implements Restaurante {

    /**
     * Este método imprime un mensaje que describe el restaurante como
     * un "Restaurante de lujo".
     */
    @Override
    public void describir() {
        System.out.println("Restaurante de lujo");
    }
}

