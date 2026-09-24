import javax.swing.JOptionPane;

public class LoginController {

    private final LoginView view;

    public LoginController(LoginView view) {
        this.view = view;

        view.getBtnIngresar().addActionListener(e -> iniciarSesion());
    }

    private void iniciarSesion() {

        String correo = view.getTxtCorreo().getText().trim();
        char[] passwordChars = view.getTxtContrasena().getPassword();

        String contrasena = new String(passwordChars);

        // Validar correo vacío
        if (correo.isEmpty()) {
            JOptionPane.showMessageDialog(
                    view,
                    "Debe ingresar un correo.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        // Validar que el correo contenga @
        if (!correo.contains("@")) {
            JOptionPane.showMessageDialog(
                    view,
                    "El correo debe contener el carácter @.",
                    "Correo inválido",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        // Validar contraseña vacía
        if (contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(
                    view,
                    "Debe ingresar una contraseña.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        // Validar longitud de contraseña
        if (contrasena.length() < 8) {
            JOptionPane.showMessageDialog(
                    view,
                    "La contraseña debe tener al menos 8 caracteres.",
                    "Contraseña inválida",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        // Credenciales de ejemplo
        String correoCorrecto = "admin@correo.com";
        String contrasenaCorrecta = "12345678";

        if (correo.equals(correoCorrecto)
                && contrasena.equals(contrasenaCorrecta)) {

            JOptionPane.showMessageDialog(
                    view,
                    "Inicio de sesión correcto.",
                    "Bienvenido",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } else {

            JOptionPane.showMessageDialog(
                    view,
                    "Correo o contraseña incorrectos.",
                    "Error de autenticación",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
