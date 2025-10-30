package introducao;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fazer um programa para ler um valor inteiro de 1 a 7 representando um\n" +
                "dia da semana (sendo 1 = domingo, 2 = segunda, e assim por diante).\n" +
                "Escrever na tela o dia da semana corerspondente.");
        System.out.println("Digite o código:");
        int codigo = scanner.nextInt();
        String dia;

        switch (codigo) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "valor invalido";
                break;
        }
        System.out.println("Dia da semana: " + dia);

        scanner.close();
    }
}
