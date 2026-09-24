import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            LoginView view = new LoginView();

            new LoginController(view);

            view.setVisible(true);
        });
    }
}

