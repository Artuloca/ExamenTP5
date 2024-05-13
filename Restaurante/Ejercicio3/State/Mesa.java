/**
 * Esta clase representa una mesa en un restaurante.
 * Cada mesa tiene un estado que puede ser LIBRE, RESERVADA u OCUPADA.
 */
package Restaurante.Ejercicio3.State;

public class Mesa {
    private EstadoMesa estado;

    /**
     * Constructor de la clase Mesa.
     * Inicializa el estado de la mesa a LIBRE.
     */
    public Mesa() {
        this.estado = EstadoMesa.LIBRE;
    }

    /**
     * Devuelve el estado actual de la mesa.
     * @return estado de la mesa.
     */
    public EstadoMesa getEstado() {
        return estado;
    }

    /**
     * Establece el estado de la mesa.
     * @param estado nuevo estado de la mesa.
     */
    public void setEstado(EstadoMesa estado) {
        this.estado = estado;
    }

    /**
     * Intenta reservar la mesa.
     * Si la mesa está libre, cambia su estado a RESERVADA y muestra un mensaje.
     * Si la mesa no está libre, muestra un mensaje indicando que no se puede reservar.
     */
    public void reservar() {
        if (estado == EstadoMesa.LIBRE) {
            estado = EstadoMesa.RESERVADA;
            System.out.println("Mesa reservada");
        } else {
            System.out.println("La mesa no está disponible para reservar");
        }
    }

    /**
     * Intenta ocupar la mesa.
     * Si la mesa está reservada, cambia su estado a OCUPADA y muestra un mensaje.
     * Si la mesa no está reservada, muestra un mensaje indicando que no se puede ocupar.
     */
    public void ocupar() {
        if (estado == EstadoMesa.RESERVADA) {
            estado = EstadoMesa.OCUPADA;
            System.out.println("Mesa ocupada");
        } else {
            System.out.println("La mesa no está disponible para ocupar");
        }
    }
}
