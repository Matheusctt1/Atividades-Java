package Atts;

import java.util.Scanner;

public class Aposentadoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu sexo (M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite os anos de contribuição: ");
        int anosContribuicao = scanner.nextInt();

        if (sexo == 'M') {
            if (idade >= 65 || anosContribuicao >= 35) {
                System.out.println("Você já pode se aposentar!");
            } else {
                int anosRestantes = Math.min(65 - idade, 35 - anosContribuicao);
                System.out.println("Faltam " + anosRestantes + " anos para você se aposentar.");
            }
        } else if (sexo == 'F') {
            if (idade >= 60 || anosContribuicao >= 30) {
                System.out.println("Você já pode se aposentar!");
            } else {
                int anosRestantes = Math.min(60 - idade, 30 - anosContribuicao);
                System.out.println("Faltam " + anosRestantes + " anos para você se aposentar.");
            }
        } else {
            System.out.println("Sexo inválido!");
        }

        scanner.close();
    }
}
