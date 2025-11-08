package ejercicio3;

public class GestorReportes {
    private GeneradorReporte generador;
    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }
    public void procesarReporte(String datos) {
        generador.generarReporte(datos);
    }
}