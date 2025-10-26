package Exercicios;

import java.util.Scanner;

public class SomaDecidindoOperador {

    public static void main(String[] args) {

        System.out.println(
                "Exercicio: Crie um programa que receba dois números e um operador (+, -, *, /, %) e realize a operação correspondente.");

        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        System.out.println("Digite o primeiro valor:");
        int x = scanner.nextInt();
        System.out.println("Digite o operador:");
        char operador = scanner.next().charAt(0);

        System.out.println("Digite o segundo valor:");
        int y = scanner.nextInt();

        switch (operador) {
            case '+':
                soma = x + y;
                break;
            case '-':
                soma = x - y;
                break;
            case '*':
                soma = x * y;
                break;
            case '/':
                soma = x / y;
                break;
            case '%':
                soma = x % y;
                break;
            default:
                System.out.println("O operador é invalido.");
        }

        System.out.println(soma);
    }
}
