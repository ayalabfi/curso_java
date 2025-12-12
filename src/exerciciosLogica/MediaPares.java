package exerciciosLogica;

import java.util.Scanner;

public class MediaPares {

    public static void main(String[] args) {

        System.out.println("Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média\n" +
                "aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for\n" +
                "digitado, mostrar a mensagem \"NENHUM NUMERO PAR\"");

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantos números serão informados: ");
        int n = sc.nextInt();
        double media = 0;
        int contador = 0;

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vetor[i] = sc.nextInt();
            if (vetor[i] % 2 == 0){
                media += vetor[i];
                contador++;
            }
        }
        if (media > 0){
            media /= contador;
            System.out.printf("Media dos números pares: %.1f", media);
        } else {
            System.out.print("Nenhum número par");
        }
    }
}
