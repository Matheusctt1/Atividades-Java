package Atts;

import java.util.Scanner;
import java.util.Arrays;

public class Circuito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] resistencias = new double[4];
        double resistenciaEquivalente = 0;

        for (int i = 0; i < resistencias.length; i++) {
            System.out.print("Digite o valor da " + (i + 1) + " resistencia: ");
            resistencias[i] = scanner.nextDouble();
            resistenciaEquivalente += resistencias[i];
        }

        double maiorResistencia = Arrays.stream(resistencias).max().orElse(0);
        double menorResistencia = Arrays.stream(resistencias).min().orElse(0);

        System.out.println("Resistência Equivalente: " + resistenciaEquivalente + " ohms");
        System.out.println("Maior Resistência: " + maiorResistencia + " ohms");
        System.out.println("Menor Resistência: " + menorResistencia + " ohms");

        scanner.close();
    }
}
