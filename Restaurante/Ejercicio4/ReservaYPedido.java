package Restaurante.Ejercicio4;
import Restaurante.Ejercicio3.State.EstadoMesa;
import Restaurante.Ejercicio3.State.Mesa;

import javax.swing.*;
import java.awt.*;

public class ReservaYPedido extends JFrame {
    private Mesa mesa;

    public ReservaYPedido(String restaurante, Mesa mesa) {
        this.mesa = mesa;

        JButton reservarMesa = new JButton("Reservar mesa");
        reservarMesa.addActionListener(e -> {
            try {
                String hora = JOptionPane.showInputDialog("Introduce la hora de la reserva");
                if (Integer.parseInt(hora) < 0) {
                    throw new HoraInvalidaException("La hora no puede ser negativa");
                }
                mesa.reservar();
            } catch (HoraInvalidaException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        JButton hacerPedido = new JButton("Hacer pedido");
        hacerPedido.addActionListener(e -> {
            String pedido = JOptionPane.showInputDialog("Introduce tu pedido");
            mesa.ocupar();
            String respuestaCocina = enviarPedidoACocina(pedido);
            JOptionPane.showMessageDialog(null, respuestaCocina, "Comida lista", JOptionPane.INFORMATION_MESSAGE, null, new Object[]{}, null);
            JButton comer = new JButton("Comer");
            comer.addActionListener(ev -> {
                mesa.setEstado(EstadoMesa.LIBRE);
                JOptionPane.showMessageDialog(null, "Has terminado de comer. La mesa está libre.");
            });
        });

        setLayout(new FlowLayout());
        add(reservarMesa);
        add(hacerPedido);
        pack();
        setVisible(true);
    }

    private String enviarPedidoACocina(String pedido) {
        // Aquí deberías implementar la lógica para enviar el pedido a la cocina
        // y devolver la respuesta de la cocina
        return "Pedido listo";
    }
}

