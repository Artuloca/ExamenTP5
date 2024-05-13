package Restaurante.Ejercicio4;

import javax.swing.*;
import java.awt.*;
import Restaurante.Ejercicio4.ControladorRestaurante;
import Restaurante.Ejercicio4.ReservaYPedido;

public class SeleccionRestaurante extends JFrame {
    private ControladorRestaurante controlador;

    public SeleccionRestaurante(ControladorRestaurante controlador) {
        this.controlador = controlador;

        JButton restaurante1 = new JButton("Restaurante de Lujo");
        restaurante1.addActionListener(e -> new ReservaYPedido("Restaurante de Lujo", controlador.getMesaLibre()));

        JButton restaurante2 = new JButton("Restaurante Tematico");
        restaurante2.addActionListener(e -> new ReservaYPedido("Restaurante Tematico", controlador.getMesaLibre()));

        JButton restaurante3 = new JButton("Restaurante Comida Rapida");
        restaurante3.addActionListener(e -> new ReservaYPedido("Restaurante Comida Rapida", controlador.getMesaLibre()));

        setLayout(new FlowLayout());
        add(restaurante1);
        add(restaurante2);
        add(restaurante3);
        pack();
        setVisible(true);
    }
}
