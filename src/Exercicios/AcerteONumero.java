package Exercicios;

import java.security.SecureRandom;
import java.util.Scanner;

public class AcerteONumero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        // int valorCorreto = random.nextInt(11);
        int valorCorreto = 3;
        System.out.println("Número gerado: " + valorCorreto);
        int nota = 5;
        int chute = 0;
        int contador = 1;

        System.out.println("Dê um chute sobre o número gerado");
        chute = scanner.nextInt();

        while (nota > 0 && chute != valorCorreto) {
            if (chute > valorCorreto) {
                System.out.println("O valor informado foi maior que o valor correto");
            } else {
                System.out.println("O valor informado foi menor que o valor correto");
            }
            if (contador < 4) {
                System.out.println("Informe novamente o seu chute:");
                chute = scanner.nextInt();
            }
            nota -= contador;
            contador *= 2;
        }
        if (nota > 0) {
            System.out.println("Parabéns! Você acertou, sua nota foi: " + nota);
        } else {
            System.out.println("Que pena! Suas chances acabaram =(");
        }
    }
}
