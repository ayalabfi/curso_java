package exerciciosLogica;

import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {

        System.out.println("Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na\n" +
                "tela todos os números pares, e também a quantidade de números pares.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de números a ser informada: ");
        int n = sc.nextInt();
        int contador = 0;
        String texto = "Números pares:\n";

        int[] pares = new int[n];
        for (int i = 0; i < pares.length; i++){
            System.out.printf("Insira o %dº valor: ", i + 1);
            pares[i] = sc.nextInt();
            if (pares[i] % 2 == 0) {
                contador++;
                texto += pares[i] + " ";
            }
        }

        System.out.println(texto);
        System.out.println("Quantidade de pares = " +  contador);

        sc.close();
    }
}
