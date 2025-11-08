package ejercicio3;

public class Main {
    public static void main(String[] args) {
        var pdf = new ReportePDF();
        var gestorPDF = new GestorReportes(pdf);
        gestorPDF.procesarReporte("Ventas del mes de octubre: $12,500");
        var excel = new ReporteExel();
        var gestorExcel = new GestorReportes(excel);
        gestorExcel.procesarReporte("Inventario actualizado al 31 de octubre");
    }
}