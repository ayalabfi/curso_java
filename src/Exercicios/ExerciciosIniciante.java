package Exercicios;

import java.util.Scanner;

public class ExerciciosIniciante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        // Exercicio 1
        System.out.println("Exercicio 01: Faça um programa para ler " +
                "dois valores inteiros, e depois mostrar na tela a soma desses números com uma\n" +
                "mensagem explicativa.");

        int valorSoma1,valorSoma2,resultadoSoma;

        System.out.println("Insira o primeiro valor");
        valorSoma1 = scanner.nextInt();

        System.out.println("Insira o segundo valor");
        valorSoma2 = scanner.nextInt();

        resultadoSoma = valorSoma1 + valorSoma2;

        System.out.printf("A soma entre %d e %d é %d%n", valorSoma1, valorSoma2, resultadoSoma);

        // Exercicio 2
        System.out.println("Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro\n" +
                "casas decimais");

        double area, pi, raio;

        pi = 3.14159;

        System.out.println("Digite o valor do raio");
        raio = scanner.nextDouble();
        area = pi*(raio*raio);

        System.out.printf("O valor da área é %.4f%n", area);

        // Exercicio 3

        System.out.println("Exercicio 3: Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto\n" +
                "de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)");

        int dif1,dif2,dif3,dif4,diferenca;

        System.out.println("Digite o primeiro valor");
        dif1 = scanner.nextInt();
        System.out.println("Digite o segundo valor");
        dif2 = scanner.nextInt();
        System.out.println("Digite o terceiro valor");
        dif3 = scanner.nextInt();
        System.out.println("Digite o quarto valor");
        dif4 = scanner.nextInt();
        diferenca = dif1 * dif2 - dif3 * dif4;

        System.out.println("A diferenca é: " + diferenca);

        // Exercicio 4

        System.out.println("Exercicio 4: Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por\n" +
                "hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas\n" +
                "decimais.");

        int numero, horasTrabalhadas;
        double valorHora, salario;

        System.out.println("Digite o número do funcionário:");
        numero = scanner.nextInt();

        System.out.println("Digite o salário por hora do funcionário:");
        valorHora = scanner.nextDouble();

        System.out.println("Digite as horas trabalhadas:");
        horasTrabalhadas = scanner.nextInt();

        salario = valorHora*(double)horasTrabalhadas;

        System.out.printf("O funcionário %d trabalhou %d horas, dessa forma, o seu salário é: R$%.2f%n", numero, horasTrabalhadas, salario);

        // Exercicio 5

        System.out.println ("Exercicio 5: Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o\n" +
                "código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago");

        int codigoPecaUm, codigoPecaDois, qtdPecas;
        double valorUm, valorDois, valorPecasTotal, valorPecas;

        System.out.println("Insira o código da peça: ");
        codigoPecaUm = scanner.nextInt();
        System.out.printf("Insira a quantidade de peças de código %d:%n",codigoPecaUm);
        qtdPecas = scanner.nextInt();
        System.out.printf("Insira o valor unitário da peça de código %d:%n",codigoPecaUm);
        valorPecas = scanner.nextDouble();

        valorUm = (double)qtdPecas*valorPecas;

        System.out.println("Insira o código da peça: ");
        codigoPecaDois = scanner.nextInt();
        System.out.printf("Insira a quantidade de peças de código %d:%n",codigoPecaDois);
        qtdPecas = scanner.nextInt();
        System.out.printf("Insira o valor unitário da peça de código %d:%n",codigoPecaDois);
        valorPecas = scanner.nextDouble();

        valorDois = (double)qtdPecas*valorPecas;

        valorPecasTotal = valorUm+valorDois;
        System.out.printf("O valor das peças de código %d foi de R$%.2f, já o valor das peças de código " +
                "%d foi de R$%.2f, totalizando R$%.2f%n",codigoPecaUm,valorUm,codigoPecaDois,valorDois,valorPecasTotal);

        // Exercicio 6

        System.out.println("Exercicio 6: Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e\n" +
                "mostre:\n" +
                "a) a área do triângulo retângulo que tem A por base e C por altura.\n" +
                "b) a área do círculo de raio C. (pi = 3.14159)\n" +
                "c) a área do trapézio que tem A e B por bases e C por altura.\n" +
                "d) a área do quadrado que tem lado B.\n" +
                "e) a área do retângulo que tem lados A e B.");

        Double A,B,C, triangulo, circulo, trapezio, quadrado, retangulo;

        System.out.println("Insira o valor de A:");
        A = scanner.nextDouble();
        System.out.println("Insira o valor de B:");
        B = scanner.nextDouble();
        System.out.println("Insira o valor de C:");
        C = scanner.nextDouble();

        triangulo = A*C/2;
        circulo = 3.14159*(C*C);
        trapezio = (A+B)*C/2;
        quadrado = B*B;
        retangulo = A*B;

        System.out.printf("Para os valores A = %.3f B = %.3f e C = %.3f as áreas são: %n" +
                "TRIANGULO: %.3f%n" +
                "CIRCULO: %.3f%n" +
                "TRAPEZIO: %.3f%n" +
                "QUADRADO: %.3f%n" +
                "RETANGULO: %.3f%n", A, B, C, triangulo, circulo, trapezio, quadrado, retangulo);
        scanner.close();

        System.out.println("Exercicios finalizados.");
    }
}
