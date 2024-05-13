package Restaurante.Ejercicio4.Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Restaurante.Ejercicio3.State.Mesa;
import Restaurante.Ejercicio4.ReservaYPedido;

public class ReservaYPedidoTest {

    @Test
    public void testReservaYPedidoCreation() {
        Mesa mesa = new Mesa();
        ReservaYPedido reservaYPedido = new ReservaYPedido("Restaurante de Lujo", mesa);
        assertNotNull(reservaYPedido);
    }

    // Aquí podrías agregar más pruebas para los métodos de la clase ReservaYPedido
}
