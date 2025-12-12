package exerciciosLogica;

import java.util.Scanner;

public class SomaVetores {

    public static void main(String[] args) {

        System.out.println("Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um\n" +
                "terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima\n" +
                "o vetor C gerado.");

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de números em cada vetor: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];

        for(int i = 0; i < A.length; i++){
            System.out.printf("Insira o valor do %dº valor do vetor A: ", i + 1);
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < B.length; i++){
            System.out.printf("Insira o valor do %dº valor do vetor B: ", i + 1);
            B[i] = sc.nextInt();
        }

        System.out.println("Vetor resultante:");

        for(int i = 0; i < C.length; i++){
            C[i] = A[i] + B[i];
            System.out.println(C[i]);
        }
    }
}
