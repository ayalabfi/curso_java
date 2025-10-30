package exercicios;

import exercicios.entidades.Triangulo;

import java.util.Scanner;

public class ComparacaoTriangulos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

       /* Comparação sem utilizar Orientação a Objetos
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Inclua as medidas do triangulo X: ");
        xA = scanner.nextDouble();
        xB = scanner.nextDouble();
        xC = scanner.nextDouble();
        System.out.println("Inclua as medidas do triangulo Y: ");
        yA = scanner.nextDouble();
        yB = scanner.nextDouble();
        yC = scanner.nextDouble();

        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p - xA)*(p - xB)*(p - xC));

        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p * (p - yA)*(p - yB)*(p - yC));

        System.out.printf("Area do triangulo X: %.4f%n", areaX);
        System.out.printf("Area do triangulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Triângulo de maior área: X");
        } else {
            System.out.println("Triângulo de maior área: Y");
        }
        */

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Inclua as medidas do triangulo X: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();
        System.out.println("Inclua as medidas do triangulo Y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double p = (x.a + x.b + x.c) / 2;
        double areaX = Math.sqrt(p * (p - x.a)*(p - x.b)*(p - x.c));

        p = (y.a + y.b + y.c) / 2;
        double areaY = Math.sqrt(p * (p - y.a)*(p - y.b)*(p - y.c));

        System.out.printf("Area do triangulo X: %.4f%n", areaX);
        System.out.printf("Area do triangulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Triângulo de maior área: X");
        } else {
            System.out.println("Triângulo de maior área: Y");
        }

        scanner.close();

    }
}
