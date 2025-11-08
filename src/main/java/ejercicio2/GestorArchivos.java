package ejercicio2;

public class GestorArchivos {
    private Almacenamiento almacenamiento;
    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    public void subirArchivo(String nombre, String contenido) {
        almacenamiento.guardarArchivo(nombre, contenido);
    }
    public void descargarArchivo(String nombre) {
        if (nombre != null) {
            System.out.println("Archivo Descargado: " + nombre );
        }
    }
    public void recuperar(String nombre){
        almacenamiento.recuperarArchivo(nombre);
    }
}