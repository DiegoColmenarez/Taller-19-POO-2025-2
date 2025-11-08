package ejercicio2;

public class Main {
    public static void main(String[] args) {
        var almacenamientoLocal = new AlmacenamientoLocal();
        var gestorLocal = new GestorArchivos(almacenamientoLocal);
        gestorLocal.subirArchivo("Tarea", "Por favor no me ponga 0");
        gestorLocal.descargarArchivo("Tarea");
        gestorLocal.recuperar("Tarea");
        System.out.println();
        var almacenamientoNube = new AlmacenamientoNube();
        var gestorNube = new GestorArchivos(almacenamientoNube);
        gestorNube.subirArchivo("Ensayo1", "Por esa razon...");
        gestorNube.descargarArchivo("Ensayo1");
        gestorNube.recuperar("Ensao1");
    }
}