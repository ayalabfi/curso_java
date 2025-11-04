package exerciciosPOO;

import java.util.Scanner;

import static exerciciosPOO.utilitarios.ConversorDeMoeda.conversor;

public class ConverterDolar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor do dolar: ");
        double valorDoDolar = scanner.nextDouble();
        System.out.print("Insira a quantidade a ser comprada: ");
        double quantidade = scanner.nextDouble();

        double total = conversor (valorDoDolar, quantidade);

        System.out.printf("Valor a ser pago em reais: R$%.2f%n", total);

    }
}
