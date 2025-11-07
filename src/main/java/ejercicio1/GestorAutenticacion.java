package ejercicio1;

public class GestorAutenticacion {
    private ServicioAutenticacion servicio;

    // Inyección de dependencia a través del constructor
    public GestorAutenticacion(ServicioAutenticacion servicio) {
        this.servicio = servicio;
    }
    public void iniciarSesion(String usuario, String contrasena) {
        boolean autenticado = servicio.autenticar(usuario, contrasena);

        if (autenticado) {
            System.out.println("Acceso concedido a " + usuario);
        } else {
            System.out.println("Acceso denegado a " + usuario);
        }
    }
}
