package exercicios;

import java.util.Scanner;

public class ExercicioTernario {


    public static void main(String[] args) {

        System.out.println("Exercicio: Um programa que receba dois números e determine qual é o maior usando o operador ternário.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        int x = scanner.nextInt();
        System.out.println("Digite o primeiro valor");
        int y = scanner.nextInt();

        int z = (x >= y) ? x : y;

        System.out.println("O maior valor informado foi: " + z);

        scanner.close();

        System.out.println("Exercicio finalizado!");
    }

}
