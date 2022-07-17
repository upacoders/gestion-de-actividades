import pantallas.Login;

public class ejecutarPrograma {

    Login login;

    public ejecutarPrograma() {
        login = new Login();
        login.setVisible(true);
    }

    public static void main(String[] args) {
        new ejecutarPrograma();
    }
}
