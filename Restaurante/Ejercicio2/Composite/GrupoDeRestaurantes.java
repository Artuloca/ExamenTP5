package Restaurante.Ejercicio2.Composite;

import java.util.ArrayList;
import java.util.List;

class GrupoDeRestaurantes extends ComponenteRestaurante {
    private List<ComponenteRestaurante> componentes = new ArrayList<ComponenteRestaurante>();

    public void agregar(ComponenteRestaurante componente) {
        componentes.add(componente);
    }
    public void eliminar(ComponenteRestaurante componente) {
        componentes.remove(componente);
    }
    public ComponenteRestaurante obtenerHijo(int i) {
        return componentes.get(i);
    }
    public void operacion() {
        for (ComponenteRestaurante componente : componentes) {
            componente.operacion();
        }
    }
}
