package ejercicio1;

public class Main {
    public static void main(String[] args) {
        ServicioAutenticacion local = new AutenticacionLocal();
        GestorAutenticacion gestorLocal = new GestorAutenticacion(local);
        gestorLocal.iniciarSesion("admin", "1234");
        gestorLocal.iniciarSesion("admin", "0000");
        System.out.println("\n-----------------------------\n");
        ServicioAutenticacion oauth = new AutenticacionOAuth();
        GestorAutenticacion gestorOAuth = new GestorAutenticacion(oauth);
        gestorOAuth.iniciarSesion("usuario_oauth", "token_valido");
        gestorOAuth.iniciarSesion("otro_usuario", "token_falso");
    }
}