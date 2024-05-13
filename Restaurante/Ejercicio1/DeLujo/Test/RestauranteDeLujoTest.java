package Restaurante.Ejercicio1.DeLujo.Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Restaurante.Ejercicio1.DeLujo.RestauranteDeLujo;

public class RestauranteDeLujoTest {

    @Test
    public void testRestauranteDeLujoCreation() {
        RestauranteDeLujo restauranteDeLujo = new RestauranteDeLujo();
        assertNotNull(restauranteDeLujo);
    }

    // Aquí podrías agregar más pruebas para los métodos de la clase RestauranteDeLujo
}
