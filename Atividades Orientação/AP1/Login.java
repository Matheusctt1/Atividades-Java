package Atts;

import javax.swing.JOptionPane;

public class Login {
    public static void main(String[] args) {
        final String USERNAME = "Matheus";
        final String PASSWORD = "090125";
        int tentativas = 3;

        while (tentativas > 0) {
            String login = JOptionPane.showInputDialog("Digite seu login:");
            String senha = JOptionPane.showInputDialog("Digite sua senha:");

            if (USERNAME.equals(login) && PASSWORD.equals(senha)) {
                JOptionPane.showMessageDialog(null, "Login realizado!");
                return;
            } else {
                tentativas--;
                JOptionPane.showMessageDialog(null, "Login ou senha incorretos. Restam " + tentativas + " tentativas.");
            }
        }

        JOptionPane.showMessageDialog(null, "Você excedeu o número de tentativas!");
    }
}
