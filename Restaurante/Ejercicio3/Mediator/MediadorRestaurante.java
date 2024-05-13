package Restaurante.Ejercicio3.Mediator;

import Restaurante.Ejercicio3.Mediator.ComponentesRestaurante.Cocina;
import Restaurante.Ejercicio3.Mediator.ComponentesRestaurante.Entrega;
import Restaurante.Ejercicio3.Mediator.ComponentesRestaurante.ServicioCliente;

class MediadorRestaurante implements Mediador {
    private Cocina cocina;
    private ServicioCliente servicioCliente;
    private Entrega entrega;

    // Métodos para establecer los componentes
    public void setCocina(Cocina cocina) {
        this.cocina = cocina;
    }

    public void setServicioCliente(ServicioCliente servicioCliente) {
        this.servicioCliente = servicioCliente;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

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


