package exerciciosLogica;

import java.util.Scanner;
import java.security.SecureRandom;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        SecureRandom sorteio = new SecureRandom();
        String escolhaComputador = "";

        System.out.println();

        // sorteia um numero de 0 à 2 (3 - 1)
        switch (sorteio.nextInt(3)) {
            case 0:
                escolhaComputador = "Tesoura";
                break;
            case 1:
                escolhaComputador = "Pedra";
                break;
            case 2:
                escolhaComputador = "Papel";
                break;
        }

        System.out.println("Escolha a sua jogada de acordo com o menu abaixo:\n" +
                "1 - Pedra\n" +
                "2 - Papel\n" +
                "3 - Tesoura");

        // implementar a leitura da escolha jogador
        int escolha = teclado.nextInt();
        String escolhaJogador = "";

        switch (escolha) {
            case 1:
                escolhaJogador = "Pedra";
                break;
            case 2:
                escolhaJogador = "Papel";
                break;
            case 3:
                escolhaJogador = "Tesoura";
        }

        if (escolhaComputador.equals(escolhaJogador)) {
            System.out.printf("Você escolheu %s e o computador escolheu %s%n", escolhaJogador,escolhaComputador);
            System.out.println("Empatou!");
        } else if (escolhaComputador.equals("Pedra") && escolhaJogador.equals("Tesoura") ||
                escolhaComputador.equals("Papel") && escolhaJogador.equals("Pedra") ||
                escolhaComputador.equals("Tesoura") && escolhaJogador.equals("Papel")) {
            System.out.printf("Você escolheu %s e o computador escolheu %s%n", escolhaJogador,escolhaComputador);
            System.out.println("Você perdeu!");
        } else {
            System.out.printf("Você escolheu %s e o computador escolheu %s%n", escolhaJogador,escolhaComputador);
            System.out.println("Você venceu!");
        }

        teclado.close();
    }
}