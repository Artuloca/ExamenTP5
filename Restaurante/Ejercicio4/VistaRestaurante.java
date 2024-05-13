package Restaurante.Ejercicio4;

import javax.swing.*;
import java.awt.*;

public class VistaRestaurante extends JFrame {
    private JLabel label;
    private JButton ejecutarOperacionButton;

    public VistaRestaurante(ControladorRestaurante controlador) {
        // Configura las propiedades de la ventana
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Crea un JLabel y lo añade a la ventana
        label = new JLabel();
        add(label);

        // Crea un JButton y lo añade a la ventana
        ejecutarOperacionButton = new JButton("Ejecutar operación");
        ejecutarOperacionButton.addActionListener(e -> controlador.ejecutarOperacion());
        add(ejecutarOperacionButton);

        // Hace visible la ventana
        setVisible(true);
    }

    public void mostrarInformacion(String info) {
        // Actualiza el texto del JLabel en el hilo de despacho de eventos de Swing
        SwingUtilities.invokeLater(() -> label.setText(info));
    }
}
