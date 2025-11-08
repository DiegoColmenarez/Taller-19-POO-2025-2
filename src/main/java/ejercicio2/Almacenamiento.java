package ejercicio2;

public interface Almacenamiento {
    void guardarArchivo(String nombreArchivo, String contenido);
    void recuperarArchivo(String nombreArchivo);
}