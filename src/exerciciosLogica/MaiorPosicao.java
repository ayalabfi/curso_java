package exerciciosLogica;

import java.util.Scanner;

public class MaiorPosicao {

    public static void main(String[] args) {

        System.out.println("Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela\n" +
                "o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,\n" +
                "considerando a primeira posição como 0 (zero).");

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantos números serão lidos: ");
        int n = sc.nextInt();

        double[] valores = new double[n];
        double maiorValor = 0;
        int posicaoMaiorValor = 0;

        for(int i = 0; i < valores.length; i++){
            System.out.printf("Insira o %dº valor: ", i + 1);
            valores[i] = sc.nextDouble();
            if (valores[i] > maiorValor){
                maiorValor = valores[i];
                posicaoMaiorValor = i;
            }
        }
        System.out.println("Maior valor = " + maiorValor);
        System.out.println("Posição do maior valor = " + posicaoMaiorValor);
    }

}
