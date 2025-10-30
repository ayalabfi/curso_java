package exercicios;

import java.util.Scanner;

public class ExerciciosWhile {

    public static void main(String[] args) {
        // Exercicio 1

        System.out.println("Exercicio 1: Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha\n" +
                "incorreta informada, escrever a mensagem \"Senha Invalida\". Quando a senha for informada corretamente deve ser\n" +
                "impressa a mensagem \"Acesso Permitido\" e o algoritmo encerrado. Considere que a senha correta é o valor 2002");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a senha:");
        int exUm = scanner.nextInt();

        while (exUm != 2002) {
            System.out.println("Senha invalida");
            System.out.println("Digite a senha:");
                    exUm = scanner.nextInt();

        }
        System.out.println("Acesso permitido");

        // Exercicio 2

        System.out.println("Exercicio 2: Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema\n" +
                "cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo\n" +
                "menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).");

        System.out.println("\nEscreva o valor de X e Y");
        int exDoisX = scanner.nextInt(), exDoisY = scanner.nextInt();

        while (exDoisX != 0 && exDoisY != 0) {

            if (exDoisX > 0 && exDoisY > 0){
                System.out.println("Primeiro");
            } else if (exDoisX > 0 && exDoisY < 0) {
                System.out.println("Quarto");
            } else if (exDoisX < 0 && exDoisY > 0) {
                System.out.println("Segundo");
            } else {
                System.out.println("Terceiro");
            }
            System.out.println("Escreva o valor de X e Y");
            exDoisX = scanner.nextInt();
            exDoisY = scanner.nextInt();
        }

        // Exercicio 3

        System.out.println("Exercicio 3: Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva\n" +
                "um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel\n" +
                "4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até\n" +
                "que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a\n" +
                "mensagem: \"MUITO OBRIGADO\" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme\n" +
                "exemplo.");

        int exTresAlcool = 0;
        int exTresGasolina = 0;
        int exTresDiesel = 0;
        int exTresCodigo;

        System.out.println("\nDigite o código a ser abastecido: " +
                "\n1 - Álcool" +
                "\n2 - Gasolina" +
                "\n3 - Diesel" +
                "\n4 - Fim");
               exTresCodigo = scanner.nextInt();
        while (exTresCodigo != 4) {
            switch (exTresCodigo) {
                case (1):
                    exTresAlcool += 1;
                    break;
                case (2):
                    exTresGasolina += 1;
                    break;
                case (3):
                    exTresDiesel += 1;
                    break;
            }
            System.out.println("Digite o código a ser abastecido: " +
                    "\n1 - Álcool" +
                    "\n2 - Gasolina" +
                    "\n3 - Diesel" +
                    "\n4 - Fim");
            exTresCodigo = scanner.nextInt();
            }
        System.out.printf("Muito obrigado! " +
                "%n1 - Alcool: %d" +
                "%n2 - Gasolina: %d" +
                "%n3 - Diesel: %d%n", exTresAlcool, exTresGasolina, exTresDiesel);

        scanner.close();

        System.out.println("Exercicios concluídos!");
        }
    }
