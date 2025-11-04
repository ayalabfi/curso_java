package exerciciosLogica;

import java.util.Scanner;

public class ExerciciosFor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Exercicio 1
        System.out.println("Exercicio 1: Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o\n" +
                "X, se for o caso.\n");
        System.out.println("Insira um valor:");
        int exUm = scanner.nextInt();
        for (int i = 1; exUm >= i; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        // Exercicio 2
        System.out.println("Exercicio 2: Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.\n" +
                "Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando\n" +
                "essas informações conforme exemplo (use a palavra \"in\" para dentro do intervalo, e \"out\" para fora do intervalo)\n");

        System.out.println("Digite a quantidade de valores que serão inseridos:");
        int exDois = scanner.nextInt();
        int exDoisIn = 0;
        int exDoisOut = 0;

        for (int i = 0; exDois > i; i++) {
            System.out.println("Digite um valor inteiro");
            int x = scanner.nextInt();
            if (x >= 10 && x <= 20) {
                exDoisIn++;
            } else {
                exDoisOut++;
            }
        }
        System.out.printf("%d in" +
                "%n%d out%n", exDoisIn, exDoisOut);

        // Exercicio 3

        System.out.println("Exercicio 3: Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste\n" +
                "de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes\n" +
                "conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem\n" +
                "peso 5.\n");

        System.out.println("Digite a quantidade de cálculos a serem realizados:");
        int exTres = scanner.nextInt();

        for (int i = 1;exTres >= i; i++){
            System.out.println("Insira a primeira nota");
            double mediaUm = scanner.nextDouble();
            System.out.println("Insira a segunda nota");
            double mediaDois = scanner.nextDouble();
            System.out.println("Insira a terceira nota");
            double mediaTres = scanner.nextDouble();
            double soma = (mediaUm * 2 + mediaDois * 3 + mediaTres * 5) / 10;
            System.out.printf("A média da %dº soma é: %.1f%n%n", i, soma);
        }

        // Exercicio 4

        System.out.println("Exercicio 4: Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo\n" +
                "segundo. Se o denominador for igual a zero, mostrar a mensagem \"divisao impossivel\".\n");

        System.out.println("Digite a quantidade de divisões a serem realizadas:");
        int exQuatro = scanner.nextInt();

        for (int i = 1; exQuatro >= i; i++){
            System.out.println("Digite o numerador:");
            int x = scanner.nextInt();
            System.out.println("Digite o denominador");
            int y = scanner.nextInt();
            double divisao;
            if (y == 0) {
                System.out.printf("O resultado da %dº divisão é impossível%n%n", i);
            } else {
                divisao = (double) x / y;
                System.out.printf("O resultado da %dº divisão é: %.1f%n%n",i,divisao);
            }
        }

        // Exercicio 5

        System.out.println("Exercicio 5: Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.\n" +
                "Lembrando que, por definição, fatorial de 0 é 1.\n");

        System.out.println("Digite o valor a ser fatorado:");

        int exCinco = scanner.nextInt();
        int somaCinco = (exCinco > 1) ? exCinco :  1;
        int somaFatorial = somaCinco;

        for (int i = 1; exCinco > i; i++) {
            somaCinco *= (somaFatorial-i);
        }
        System.out.printf("A fatoração de %d é: %d%n", exCinco, somaCinco);

        /* Solução do professor
        Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}

		System.out.println(fat);
         */

        // Exercicio 6

        System.out.println("Exercicio 6: Ler um número inteiro N e calcular todos os seus divisores.\n");

        int exSeis = scanner.nextInt();

        for (int i = 1; exSeis >= i; i++){
        if (exSeis % i == 0) {
            System.out.printf("%d é divisível por %d%n", exSeis, i);
        }
        }

        // Exercicio 7

        System.out.println("Exercicio 7: Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,\n" +
                "começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor.");

        int exSete = scanner.nextInt();

        for (int i = 1; exSete >= i; i++){
         int quadrado = i * i;
         int cubo = i * i * i;
            System.out.printf("%d %d %d%n", i, quadrado, cubo);
        }

        System.out.println("Exercicios finalizados.");

        scanner.close();
    }
}
