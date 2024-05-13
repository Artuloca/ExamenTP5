package Restaurante.Ejercicio4;
import javax.swing.*;
import java.awt.*;

public class SeleccionRestaurante extends JFrame {
    public SeleccionRestaurante() {
        JButton restaurante1 = new JButton("Restaurante de Lujo");
        restaurante1.addActionListener(e -> new ReservaYPedido("Restaurante de Lujo"));

        JButton restaurante2 = new JButton("Restaurante Tematico");
        restaurante2.addActionListener(e -> new ReservaYPedido("Restaurante Tematico"));

        JButton restaurante3 = new JButton("Restaurante Comida Rapida");
        restaurante3.addActionListener(e -> new ReservaYPedido("Restaurante Comida Rapida"));

        setLayout(new FlowLayout());
        add(restaurante1);
        add(restaurante2);
        add(restaurante3);
        pack();
        setVisible(true);
    }
}
