package ejercicio3;

public class ReporteExel implements GeneradorReporte{
    public void generarReporte(String datos) {
        System.out.printf("""
                Generando reporte en formato Exel...
                Contenido del reporte: %s
                Reporte Exel generado correctamente.
                """, datos);
    }
}