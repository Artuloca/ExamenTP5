package Restaurante.Ejercicio3.Command.Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Restaurante.Ejercicio3.Command.Cancelar;
import Restaurante.Ejercicio3.Command.Ordenar;
import Restaurante.Ejercicio3.Command.Reservar;

public class CommandTest {

    @Test
    public void testCommandCreation() {
        Cancelar cancelar = new Cancelar();
        Ordenar ordenar = new Ordenar();
        Reservar reservar = new Reservar();
        assertNotNull(cancelar);
        assertNotNull(ordenar);
        assertNotNull(reservar);
    }

    // Aquí podrías agregar más pruebas para los métodos de las clases del paquete Command
}
