package exerciciosLogica;

import java.util.Scanner;

public class ExercicioIMC {

    public static void main(String[] args) {

        System.out.println("Desenvolver um algoritmo que obtenha o peso (em quilogramas) e a altura (em metros) de uma pessoa, \n" +
                "calcule o Índice de Massa Corporal (IMC) e informe a classificação de obesidade com base no valor do IMC, conforme a tabela \n" +
                "de referência da Organização Mundial da Saúde (OMS). Submeta o arquivo java com o código desenvolvido. \n" +
                "Utilize os recursos aprendidos até agora, como comentário, try catch e if else.");

        Scanner scanner = new Scanner(System.in);

        float altura = 0f;
        float peso = 0f;
        boolean validador1 = false;
        boolean validador2 = false;

        while (validador1 != true || validador2 != true) {
            try {
                System.out.print("Digite sua altura: ");
                altura = scanner.nextFloat();
                validador1 = true;

                System.out.print("\nDigite seu peso: ");
                peso = scanner.nextFloat();
                validador2 = true;
            } catch (Exception e) {
                System.out.println("\nValor invalido!\n");
                scanner.nextLine();
            }
        }

        scanner.close();

        float IMC = peso / (altura * altura);

        if (IMC < 18.5) {
            System.out.printf("O seu IMC é: %.2f%n A sua classificação segundo o OMS é: abaixo do peso", IMC);
        } else if (IMC >= 18.5 && IMC < 25) {
            System.out.printf("O seu IMC é: %.2f%n A sua classificação segundo o OMS é: Peso normal", IMC);
        } else if (IMC >= 25 && IMC < 30) {
            System.out.printf("O seu IMC é: %.2f%n A sua classificação segundo o OMS é: Sobrepeso", IMC);
        } else if (IMC >= 30 && IMC < 35) {
            System.out.printf("O seu IMC é: %.2f%n A sua classificação segundo o OMS é: Obesidade grau I", IMC);
        } else if (IMC >= 35 && IMC < 40) {
            System.out.printf("O seu IMC é: %.2f%n A sua classificação segundo o OMS é: Obesidade grau II", IMC);
        } else {
            System.out.printf("O seu IMC é: %.2f%n A sua classificação segundo o OMS é: Obesidade grau III (Obesidade mórbida)", IMC);
        }
    }
}
