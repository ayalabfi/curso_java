package exerciciosPOO;

import exerciciosPOO.entidades.Alturas;

import java.util.Scanner;

public class AlturasArray {

    public static void main(String[] args) {

        System.out.println("Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na \n" +
                "tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, \n" +
                "bem como os nomes dessas pessoas caso houver.");

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantas pessoas serão cadastradas: ");
        int n = sc.nextInt();

        Alturas[] alturas = new Alturas[n];

        for (int i = 0; i < alturas.length; i++){
            sc.nextLine();
            System.out.printf("Insira o nome da %dº pessoa: ", i + 1);
            String nome = sc.nextLine();

            System.out.printf("Insira a idade da %dº pessoa: ", i + 1);
            int idade = sc.nextInt();

            System.out.printf("Insira a altura da %dº pessoa: ", i + 1);
            double altura = sc.nextDouble();

            alturas[i] = new Alturas(nome, idade, altura);
        }

        double somaAlturas  = 0;

        for (int i = 0; i < alturas.length; i++){
            somaAlturas += alturas[i].getAltura();
        }

        somaAlturas /= alturas.length;
        System.out.printf("\nAltura média: %.2f\n", somaAlturas);

        double percentualIdade = 0;

        for (int i = 0; i < alturas.length; i++){
            if (alturas[i].getIdade() < 16) {
                percentualIdade += 1;
            }
        }

        percentualIdade = (percentualIdade / alturas.length) * 100;
        System.out.println("Pessoas com menos de 16 anos: " + percentualIdade + "%");

        for (int i = 0; i < alturas.length; i++){
            if (alturas[i].getIdade() < 16) {
                System.out.println(alturas[i].getNome());
            }
        }

    }
}
