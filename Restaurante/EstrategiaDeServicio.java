package Restaurante;


interface EstrategiaDeServicio {
    void ejecutarEstrategia();
}

class EstrategiaRapida implements EstrategiaDeServicio {
    public void ejecutarEstrategia() {
        System.out.println("Ejecutando estrategia rápida...");
    }
}

class EstrategiaTematica implements EstrategiaDeServicio {
    public void ejecutarEstrategia() {
        System.out.println("Ejecutando estrategia temática...");
    }
}

class EstrategiaDeLujo implements EstrategiaDeServicio {
    public void ejecutarEstrategia() {
        System.out.println("Ejecutando estrategia de lujo...");
    }
}
