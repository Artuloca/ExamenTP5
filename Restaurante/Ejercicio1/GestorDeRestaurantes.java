package Restaurante.Ejercicio1;


class GestorDeRestaurantes {
    private static GestorDeRestaurantes instanciaUnica = new GestorDeRestaurantes();

    private GestorDeRestaurantes() {}

    public static GestorDeRestaurantes getInstancia() {
        return instanciaUnica;
    }

    public void gestionar() {
        System.out.println("Gestionando restaurantes...");
    }
}
