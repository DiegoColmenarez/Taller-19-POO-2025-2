package ejercicio3;

public class ReportePDF implements GeneradorReporte {
    @Override
    public void generarReporte(String datos) {
        System.out.printf("""
                Generando reporte en formato PDF...
                Contenido del reporte: %s
                Reporte PDF generado correctamente.
                """, datos);
    }
}