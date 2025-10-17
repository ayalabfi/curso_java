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

        int exDois;

        exDois = scanner.nextInt();

        if (exDois % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        // Exercicio 3
        System.out.println("Exercicio 3: Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem \"Sao Multiplos\" ou \"Nao sao\n" +
                "Multiplos\", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em\n" +
                "ordem crescente ou decrescente.");

        int numUmExTres, numDoisExTres;

        System.out.println("Digite o primeiro número:");
        numUmExTres = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        numDoisExTres = scanner.nextInt();
        if (numUmExTres % numDoisExTres == 0 || numDoisExTres % numUmExTres == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }

        // Exercicio 4
        System.out.println("Exercicio 4: Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode\n" +
                "começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas");

        int horaInicialExQuatro, horaFinalExQuatro, resultadoExQuatro;

        System.out.println("Insira a hora inicial do jogo:");
        horaInicialExQuatro = scanner.nextInt();
        System.out.println("Insira a hora final do jogo:");
        horaFinalExQuatro = scanner.nextInt();

        if (horaInicialExQuatro < horaFinalExQuatro) {
            resultadoExQuatro = horaFinalExQuatro - horaInicialExQuatro;
        } else {
            resultadoExQuatro = 24 - horaInicialExQuatro + horaFinalExQuatro;
        }
        System.out.printf("O jogo durou %d hora(s)%n", resultadoExQuatro);

        // Exercicio 5
        System.out.printf("Exercicio 5: Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A\n" +
                "seguir, calcule e mostre o valor da conta a pagar.%n" +
                "Codigo - Especificação - Preço%n" +
                "1 - Cachorro Quente - 4,00%n" +
                "2 - X-Salada - 4,50%n" +
                "3 - X-Bacon - 5,00%n" +
                "4 - Torrada simples - 2,00%n" +
                "5 - Refrigerante - 1,50%n");
        int codigoExCinco, quantidadeExCinco;
        double valorExCinco;

        System.out.println("Insira o código do pedido:");
        codigoExCinco = scanner.nextInt();
        System.out.println("Insira a quantidade:");
        quantidadeExCinco = scanner.nextInt();

        if (codigoExCinco == 1){
            valorExCinco = (double) quantidadeExCinco * 4;
            System.out.printf("Total: R$ %.2f%n", valorExCinco);
        } else if (codigoExCinco == 2){
            valorExCinco = (double) quantidadeExCinco * 4.5;
            System.out.printf("Total: R$ %.2f%n", valorExCinco);
        } else if (codigoExCinco == 3){
            valorExCinco = (double) quantidadeExCinco * 5;
            System.out.printf("Total: R$ %.2f%n", valorExCinco);
        } else if (codigoExCinco == 4){
            valorExCinco = (double) quantidadeExCinco * 2;
            System.out.printf("Total: R$ %.2f%n", valorExCinco);
        } else if (codigoExCinco == 5){
            valorExCinco = (double) quantidadeExCinco * 1.5;
            System.out.printf("Total: R$ %.2f%n", valorExCinco);
        } else {
            System.out.println("O código informado não foi identificado, por favor tente novamente.");
        }

        // Exercicio 6
        System.out.println("Exercicio 6: Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos\n" +
                "seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em\n" +
                "nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.");

        double exSeis;

        System.out.println("Digite o valor");
        exSeis = scanner.nextDouble();

        if (exSeis >= 0 && exSeis <= 25){
            System.out.println("Intervalo [0 a 25]");
        } else if (exSeis > 25 && exSeis <= 50){
            System.out.println("Intervalo [25 a 50]");
        } else if (exSeis > 50 && exSeis <= 75){
            System.out.println("Intervalo [50 a 75]");
        } else if (exSeis > 75 && exSeis <= 100) {
            System.out.println("Intervalo [75 a 100]");
        } else {
            System.out.println("Fora de intervalo");
        }

        // Exercicio 7
        System.out.println("Exercicio 7: Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas\n" +
                "de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o\n" +
                "ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).\n" +
                "Se o ponto estiver na origem, escreva a mensagem “Origem”.\n" +
                "Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a\n" +
                "situação.");

        double eixoXExSete, eixoYExSete;

        System.out.println("Digite o eixo X");
        eixoXExSete = scanner.nextDouble();
        System.out.println("Digite o eixo Y");
        eixoYExSete = scanner.nextDouble();

        if (eixoXExSete < 0 && eixoYExSete < 0) {
            System.out.println("Q3");
        } else if (eixoXExSete < 0 && eixoYExSete > 0) {
            System.out.println("Q2");
        } else if (eixoXExSete > 0 && eixoYExSete < 0) {
            System.out.println("Q4");
        } else if (eixoXExSete > 0 && eixoYExSete > 0) {
            System.out.println("Q1");
        } else {
            System.out.println("Um ou todos os pontos estão na origem.");
        }

        // Exercicio 8
        System.out.println("Exercicio 8: Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem\n" +
                "que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem\n" +
                "qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.\n" +
                "Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e\n" +
                "mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo\n" +
                "Renda - Imposto de Renda\n" +
                "de 0.00 a 2000.00 - Isento\n" +
                "de 2000.01 a 3000.00 - 8%\n" +
                "de 3000.01 a 4500 - 18%\n" +
                "acima de 4500 - 28%\n" +
                "Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de\n" +
                "salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é\n" +
                "de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com\n" +
                "duas casas decimais.");

        double salarioExOito,ImpostoExOito;

        System.out.println("Digite o seu salário: ");
        salarioExOito = scanner.nextDouble();

        if (salarioExOito <= 2000) {
            System.out.println("Isento");
        } else if (salarioExOito > 2000 && salarioExOito <= 3000) {
            ImpostoExOito = (salarioExOito - 2000) * 0.08;
            System.out.printf("R$ %.2f%n", ImpostoExOito);
        } else if (salarioExOito > 3000 && salarioExOito <= 4500) {
            ImpostoExOito = (1000*0.08) + ((salarioExOito - 3000)*0.18);
            System.out.printf("R$ %.2f%n", ImpostoExOito);
        } else {
            ImpostoExOito = (1000*0.08) + (1500*0.18) + ((salarioExOito - 4500) * 0.28);
            System.out.printf("R$ %.2f%n", ImpostoExOito);
        }
    }
}
