package Restaurante.Ejercicio1;

import Restaurante.Ejercicio1.DeLujo.RestauranteDeLujo;
import Restaurante.Ejercicio1.Rapido.RestauranteRapido;
import Restaurante.Ejercicio1.Tematico.RestauranteTematico;

class RestauranteFactory {
    public Restaurante getRestaurante(String tipo) {
        if (tipo == null) {
            return null;
        }
        if (tipo.equalsIgnoreCase("RAPIDO")) {
            return new RestauranteRapido();
        } else if (tipo.equalsIgnoreCase("TEMATICO")) {
            return new RestauranteTematico();
        } else if (tipo.equalsIgnoreCase("LUJO")) {
            return new RestauranteDeLujo();
        }
        return null;
    }
}
