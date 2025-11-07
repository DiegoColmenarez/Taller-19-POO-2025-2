package ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        if (usuario.equals("admin") && contrasena.equals("1234")) {
            System.out.println("Autenticación local exitosa para " + usuario);
            return true;
        } else {
            System.out.println("Error de autenticación local para " + usuario);
            return false;
        }
    }
}