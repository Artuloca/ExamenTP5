package Restaurante.Ejercicio3.State;

public class Mesa {
    private EstadoMesa estado;

    public Mesa() {
        this.estado = EstadoMesa.LIBRE;
    }

    public EstadoMesa getEstado() {
        return estado;
    }

    public void setEstado(EstadoMesa estado) {
        this.estado = estado;
    }

    public void reservar() {
        if (estado == EstadoMesa.LIBRE) {
            estado = EstadoMesa.RESERVADA;
            System.out.println("Mesa reservada");
        } else {
            System.out.println("La mesa no está disponible para reservar");
        }
    }

    public void ocupar() {
        if (estado == EstadoMesa.RESERVADA) {
            estado = EstadoMesa.OCUPADA;
            System.out.println("Mesa ocupada");
        } else {
            System.out.println("La mesa no está disponible para ocupar");
        }
    }
}
