package ejercicio1;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        System.out.println("Autenticando usuario " + usuario + " mediante OAuth...");
        boolean exito = usuario.equals("usuario_oauth") && contrasena.equals("token_valido");
        if (exito) {
            System.out.println("Autenticación OAuth exitosa para " + usuario);
        } else {
            System.out.println("Error de autenticación OAuth para " + usuario);
        }
        return exito;
    }
}