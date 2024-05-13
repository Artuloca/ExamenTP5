package Restaurante.Ejercicio4;

import Restaurante.Ejercicio2.Composite.ComponenteRestaurante;
import Restaurante.Ejercicio3.State.Mesa;
import Restaurante.Ejercicio3.State.EstadoMesa;
import Restaurante.Ejercicio4.ModeloRestaurante;
import Restaurante.Ejercicio4.SeleccionRestaurante;
import Restaurante.Ejercicio4.VistaRestaurante;

import javax.swing.*;

public class ControladorRestaurante {
    
    private ModeloRestaurante modelo;
    private VistaRestaurante vista;

    // Crear las mesas al inicio del código
    private static Mesa[] mesas = new Mesa[4];

    static {
        for (int i = 0; i < mesas.length; i++) {
            mesas[i] = new Mesa();
        }
    }

    public ControladorRestaurante(ModeloRestaurante modelo, VistaRestaurante vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutarOperacion() {
        modelo.operacion();
        vista.mostrarInformacion("Operación ejecutada");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SeleccionRestaurante();
        });
    }

    public boolean hayMesasLibres() {
        for (Mesa mesa : mesas) {
            if (mesa.getEstado() == EstadoMesa.LIBRE) {
                return true;
            }
        }
        return false;
    }
}
