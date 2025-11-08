package ejercicio2;

public class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombreArchivo, String contenido) {
        System.out.println("Archivo a guardar: " + nombreArchivo + "\n Contenido: " + contenido + "\n Se guardo exitosamente.");
    }

    @Override
    public void recuperarArchivo(String nombreArchivo) {
        System.out.println("El archivo " + nombreArchivo + " fue recuperado");
    }
}