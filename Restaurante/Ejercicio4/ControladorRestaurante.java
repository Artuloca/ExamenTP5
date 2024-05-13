package Restaurante.MVC;

import Restaurante.Ejercicio2.Composite.ComponenteRestaurante;

public class ControladorRestaurante {
    private Restaurante.MVC.ModeloRestaurante modelo;
    private Restaurante.MVC.VistaRestaurante vista;

    public ControladorRestaurante(Restaurante.MVC.ModeloRestaurante modelo, VistaRestaurante vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutarOperacion() {
        modelo.operacion();
        vista.mostrarInformacion("Operación ejecutada");
    }
}
