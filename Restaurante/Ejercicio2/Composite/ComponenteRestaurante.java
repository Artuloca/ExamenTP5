package Restaurante.Ejercicio2.Composite;

abstract class ComponenteRestaurante {
    public void agregar(ComponenteRestaurante componente) {
        throw new UnsupportedOperationException();
    }
    public void eliminar(ComponenteRestaurante componente) {
        throw new UnsupportedOperationException();
    }
    public ComponenteRestaurante obtenerHijo(int i) {
        throw new UnsupportedOperationException();
    }
    public void operacion() {
        throw new UnsupportedOperationException();
    }
}
