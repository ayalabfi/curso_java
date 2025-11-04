package exerciciosPOO;

import exerciciosPOO.entidades.Retangulo;

import java.util.Scanner;

public class DadosDoRetangulo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.print("Insira a largura do retângulo: ");
        retangulo.largura = scanner.nextDouble();
        System.out.print("Insira a altura do retângulo: ");
        retangulo.altura = scanner.nextDouble();

        System.out.println(retangulo);

        scanner.close();
    }
}
