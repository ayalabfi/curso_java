package Exercicios;

import java.util.Scanner;

public class ExerciciosCondicional {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Exercicio 1
        System.out.println("Exercicio 1: Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.");
        int exUm;

        System.out.println("Digite um número");
        exUm = scanner.nextInt();

        if (exUm < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }

        // Exercicio 2
        System.out.println("Exercicio 2: Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.");

        int exDois, restoDois;

        exDois = scanner.nextInt();
        restoDois = exDois % 2;

        if (restoDois == 0 ){
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

    }
}
