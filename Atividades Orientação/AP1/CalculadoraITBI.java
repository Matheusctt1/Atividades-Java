package Atts;

import javax.swing.*;

public class CalculadoraITBI {
    public static void main(String[] args) {
        double valorTransacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de transação:"));
        double valorVenal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor venal:"));
        double porcentagem = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem do imposto ITBI:"));

        double baseCalculo = Math.max(valorTransacao, valorVenal);
        double imposto = (baseCalculo * porcentagem) / 100;

        JOptionPane.showMessageDialog(null, "Imposto ITBI: R$ " + imposto);
    }
}
