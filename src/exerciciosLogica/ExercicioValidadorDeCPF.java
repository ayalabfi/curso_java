package exerciciosLogica;

import java.util.Scanner;

public class ExercicioValidadorDeCPF {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int CPF = 0;
        boolean validador = false;
        String rastreador = "";
        int verificador = 0;
        int resto = 0;
        String mensagem = "O CPF";
        while (validador != true) {
            try {
                System.out.print("Digite os 9 primeiros dígitos do CPF: ");
                CPF = scanner.nextInt();
                rastreador = Integer.toString(CPF);
                int qtdCaracteres = rastreador.length();
                if (qtdCaracteres != 9) {
                    throw new IllegalArgumentException("O CPF informado não tem 9 dígitos");
                }
                validador = true;
                scanner.close();
            } catch (Exception e) {
                System.out.println("Não inclua pontuações ou letras ao CPF, ele deverá possuir exatamente 9 dígitos.");
                scanner.nextLine();
            }
        }

        int soma = 0;
        int caracter = 0;
        for (int i = 10; i >= 2; i--) {
            int valor = rastreador.charAt(caracter);
            int conversor = Character.getNumericValue(valor);
            soma += (conversor * i);
            caracter++;
        }
        if (soma % 11 >= 2) {
            resto = soma % 11;
            verificador = 11 - resto;
            rastreador += Integer.toString(verificador);
        } else {
            rastreador += Integer.toString(0);
        }

        soma = 0;
        caracter = 0;
        for (int i = 11; i >= 2; i--) {
            int valor = rastreador.charAt(caracter);
            int conversor = Character.getNumericValue(valor);
            soma += (conversor * i);
            caracter++;
        }
        if (soma % 11 >= 2) {
            resto = soma % 11;
            verificador = 11 - resto;
            rastreador += Integer.toString(verificador);
        } else {
            rastreador += Integer.toString(0);
        }
        try {
            int qtdCaracteres = rastreador.length();
            int c1 = rastreador.charAt(0);
            int c2 = rastreador.charAt(1);
            int c3 = rastreador.charAt(2);
            int c4 = rastreador.charAt(3);
            int c5 = rastreador.charAt(4);
            int c6 = rastreador.charAt(5);
            int c7 = rastreador.charAt(6);
            int c8 = rastreador.charAt(7);
            int c9 = rastreador.charAt(8);
            int c10 = rastreador.charAt(9);
            int c11 = rastreador.charAt(10);
            if (qtdCaracteres != 11) {
                throw new IllegalArgumentException("O CPF não tem 11 dígitos");
            } else if (c1 == c2 && c1 == c3 && c1 == c4 && c1 == c5 && c1 == c6 && c1 == c7 && c1 == c8 && c1 == c9 && c1 == c10 && c1 == c11) {
                throw new IllegalArgumentException("O CPF é invalido");
            }
        } catch (Exception er) {
            mensagem += " não";
        }

        System.out.println("O CPF é: " + rastreador);
        mensagem += " é valido";

        System.out.println(mensagem);
    }
}
