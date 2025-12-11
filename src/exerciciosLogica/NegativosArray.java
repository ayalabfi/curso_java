package exerciciosLogica;

import java.util.Scanner;

public class NegativosArray {

    public static void main(String[] args) {

        System.out.println("Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros \n" +
                "e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.");

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de números a ser lida: ");
        int n = sc.nextInt();

        int[] valores = new int[n];

        for (int i = 0; i < valores.length; i++){
            System.out.printf("Insira o valor do %dº número: ", i + 1);
            valores[i] = sc.nextInt();
        }

        System.out.println("Números negativos:");

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] < 0) {
                System.out.println(valores[i]);
            }
        }

        sc.close();
    }

}
