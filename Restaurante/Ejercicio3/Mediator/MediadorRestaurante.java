package Restaurante.Ejercicio3.Mediator;

class MediadorRestaurante implements Mediador {
    private Cocina cocina;
    private ServicioCliente servicioCliente;
    private Entrega entrega;

    // Métodos para establecer los componentes...

    public void enviar(String mensaje, Componente componente) {
        if (componente == cocina) {
            entrega.recibir(mensaje);
        } else if (componente == servicioCliente) {
            cocina.recibir(mensaje);
        } else if (componente == entrega) {
            servicioCliente.recibir(mensaje);
        }
    }
}


