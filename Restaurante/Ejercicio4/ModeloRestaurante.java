package Restaurante.Ejercicio4;

import Restaurante.Ejercicio2.Composite.ComponenteRestaurante;

public class ModeloRestaurante {
    private ComponenteRestaurante restaurante;

    public ModeloRestaurante(ComponenteRestaurante restaurante) {
        this.restaurante = restaurante;
    }

    public void operacion() {
        restaurante.operacion();
    }
}
