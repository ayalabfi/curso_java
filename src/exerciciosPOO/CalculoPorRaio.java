package exerciciosPOO;

import exerciciosPOO.utilitarios.Calculadora;

import java.util.Scanner;

public class CalculoPorRaio {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor do raio: ");
        double raio = scanner.nextDouble();
        double circunferencia = Calculadora.circunferencia(raio);
        double volume = Calculadora.volume(raio);

        System.out.printf("Circunferência: %.2f%n", circunferencia);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("PI: %.2f%n", Calculadora.PI);

        scanner.close();
    }
}