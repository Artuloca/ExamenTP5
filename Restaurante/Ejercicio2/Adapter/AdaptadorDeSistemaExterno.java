package Restaurante.Ejercicio2.Adapter;

class AdaptadorDeSistemaExterno implements SistemaExterno {
    private SistemaExternoConcreto sistemaExternoConcreto;

    public AdaptadorDeSistemaExterno(SistemaExternoConcreto sistemaExternoConcreto) {
        this.sistemaExternoConcreto = sistemaExternoConcreto;
    }
}