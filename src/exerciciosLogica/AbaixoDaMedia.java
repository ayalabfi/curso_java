package exerciciosLogica;

import java.util.Scanner;

public class AbaixoDaMedia {

    public static void main(String[] args) {

        System.out.println("Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,\n" +
                "mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos\n" +
                "os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.");

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de valores a ser inserida: ");
        int n = sc.nextInt();
        double[] vetor = new double[n];
        double media = 0;

        for(int i = 0; i < vetor.length; i++){
            System.out.printf("Insira o %dº valor: ", i + 1);
            vetor[i] = sc.nextDouble();
            media += vetor[i];
        }

        media /= vetor.length;

        System.out.printf("\nMedia do vetor: %.3f\n", media);

        System.out.println("Elementos abaixo da média:");
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < media){
                System.out.printf("%.1f\n", vetor[i]);
            }
        }
    }
}
