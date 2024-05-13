package Restaurante.Ejercicio4.Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Restaurante.Ejercicio4.ControladorRestaurante;
import Restaurante.Ejercicio4.SeleccionRestaurante;

public class SeleccionRestauranteTest {

    @Test
    public void testSeleccionRestauranteCreation() {
        ControladorRestaurante controlador = new ControladorRestaurante();
        SeleccionRestaurante seleccionRestaurante = new SeleccionRestaurante(controlador);
        assertNotNull(seleccionRestaurante);
    }

    // Aquí podrías agregar más pruebas para los métodos de la clase SeleccionRestaurante
}
