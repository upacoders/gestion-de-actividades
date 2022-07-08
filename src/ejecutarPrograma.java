
import pantallas.Login;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Lenovo
 */
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
