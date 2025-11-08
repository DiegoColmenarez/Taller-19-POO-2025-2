package ejercicio2;

public class AlmacenamientoNube implements Almacenamiento{
    @Override
    public void guardarArchivo(String nombreArchivo, String contenido) {
        System.out.println("El archivo " + nombreArchivo + " fue subido a la nube. \ncontenido:\n" + contenido);
    }
    @Override
    public void recuperarArchivo(String nombreArchivo) {
        System.out.println("El archivo " + nombreArchivo + " ha sido recuperado exitosamente");
    }
}