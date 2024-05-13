package Restaurante.Ejercicio3.Mediator.ComponentesRestaurante;

import Restaurante.Ejercicio3.Mediator.Componente;
import Restaurante.Ejercicio3.Mediator.Mediador;

public class Entrega implements Componente {
    private Mediador mediador;

    public Entrega(Mediador mediador) {
        this.mediador = mediador;
    }

    @Override
    public void enviar(String mensaje) {
        mediador.enviar(mensaje, this);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("Entrega recibió: " + mensaje);
    }
}
