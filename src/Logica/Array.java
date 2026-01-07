package Logica;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        // Declaração de quantas posições o vetor terá.
        System.out.print("Digite a quantidade de números a ser inserida: ");
        int n = sc.nextInt();

        // Criação de um vetor do tipo double com n posições.
        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vetor[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i<n; i++) {
            soma += vetor[i];
        }

        double media = soma / n;
        System.out.printf("A média é: %.2f", media);

        sc.close();
    }
}
