package Exercicios;

import java.util.Scanner;

public class ExercicioSwitchCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Exercicio: Crie um programa que receba uma letra (A, B, C, D, F) e exiba a descrição da nota");

        System.out.println("Digite a nota em formato americano:");
        char nota = scanner.next().charAt(0);

        switch (nota) {
            case 'A':
                System.out.println("Excelente (9.0 - 10.0)");
                break;
            case 'B':
                System.out.println("Muito bom (8.0 - 8.9)");
                break;
            case 'C':
                System.out.println("Bom (7.0 - 7.9)");
                break;
            case 'D':
                System.out.println("Regular (6.0 - 6.9)");
                break;
            case 'F':
                System.out.println("Reprovado (0.0 - 5.9)");
                break;
            default:
                System.out.println("Valor informado invalido.");
                break;
        }
        System.out.println("Exercicio: Crie um programa que receba um mês (1 a 12) e exiba a estação do ano");

        System.out.println("Digite o mês de consulta:");
        int mes = scanner.nextInt();

        switch (mes) {
            case 12:
            case 1:
            case 2:
                System.out.println("Verão");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Outono");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Inverno");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Primavera");
                break;
            default:
                System.out.println("O mês informado é invalido.");
        }
    }
}
