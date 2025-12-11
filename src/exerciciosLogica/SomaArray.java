package exerciciosLogica;

import java.util.Scanner;

public class SomaArray {

    public static void main(String[] args) {

        System.out.println("aça um programa que leia N números reais e armazene-os em um vetor. Em seguida: \n" +
                "- Imprimir todos os elementos do vetor \n" +
                "- Mostrar na tela a soma e a média dos elementos do vetor ");

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de números a ser lida: ");

        int n = sc.nextInt();
        double[] valor = new double[n];

        for (int i = 0; i < valor.length; i++){
            System.out.printf("Digite o %dº valor: ", i + 1);
            valor[i] = sc.nextDouble();
        }

        String texto = "Valores = ";

        for (int i = 0; i < valor.length; i++){
            texto += valor[i] + " ";
        }

        System.out.println(texto);

        double soma = 0;

        for (int i = 0; i < valor.length; i++){
            soma += valor[i];
        }

        System.out.println("Soma = " + soma);

        double media = soma / valor.length;

        System.out.println("Media: " + media);

        sc.close();
    }
}
