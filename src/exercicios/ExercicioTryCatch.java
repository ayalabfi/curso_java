package exercicios;

import java.util.Scanner;

public class ExercicioTryCatch {

    public static void main(String[] args) {

//Escreva um algoritmo que leia as dimensões de um terreno (frente e lateral).
//Leia também o valor do metro quadrado.
//Após as leituras, calcule a area total do terreno e o valor do terreno com base no valor do metro quadrado.
//Caso o terreno seja um quadrado perfeito, aumente o valor do terreno em 10% pois este terreno é mais valioso.
//Caso o terreno não seja um quadrado perfeito, de um desconto no valor total de 2%.

        System.out.println("Exercicio: Com base no código abaixo, faça as alterações necessárias para que o código não seja interrompido por \n"
                + "qualquer exceção que ocorra. Utilize o try catch para realizar a tratativa dos valores inseridos pelo usuário e demais \n"
                + "outras exceções. ");

        Scanner teclado = new Scanner(System.in);

        int frenteMts = 0, lateralMts = 0;
        float valorMetroQuadrado = 0f, valorTerreno;
        boolean validacao = false;

        while (validacao != true) {
            try {
                System.out.print("Digite a metragem da frente do terreno: ");
                frenteMts = teclado.nextInt();

                validacao = true; // leitura bem sucedida
            } catch (Exception e1) {
                System.out.println("\nSugestão: A metragem frontal do terreno deve ser inteira, sem letras ou caracteres especiais.\n");
                teclado.nextLine(); // limpa o buffer do scanner em caso de erro
            }
        }
        validacao = false;

        while (validacao != true) {
            try {
                System.out.print("Digite a metragem da lateral do terreno: ");
                lateralMts = teclado.nextInt();
                validacao = true;
            } catch (Exception e2) {
                System.out.println("\nSugestão: A metragem lateral do terreno deve ser inteira, sem letras ou caracteres especiais.\n");
                teclado.nextLine();
            }
        }

        validacao = false;

        while (validacao != true) {
            try {
                System.out.print("Digite o valor do metro quadrado: ");
                valorMetroQuadrado = teclado.nextFloat();
                validacao = true;
            } catch (Exception e2) {
                System.out.println("\nSugestão: Confira qual o método utilizado na linguagem do seu computador para dividir a parte inteira da decimal e\n"
                        + "não utilize outros caracteres no retorno do valor do metro quadrado além da separação indicada anteriormente.\n");
                teclado.nextLine();
            }
        }
        //calculando o valor do terreno
        valorTerreno = frenteMts * lateralMts * valorMetroQuadrado;

        // estrutura de decisão composta
        if (frenteMts == lateralMts) { //condicao para ver se é um quadrado
            //este bloco é executado se a condição (frenteMts == lateralMts) for verdadeira
            //que o valor do terreno seja acrescido em 10%
            //valorTerreno = (valorTerreno * 0.1f) + valorTerreno;
            valorTerreno = (valorTerreno * 1.1f);
        } else {//se nao for quadrado da um desconto
            //este bloco é executado se a condição (frenteMts == lateralMts) for falsa
            //valorTerreno = (valorTerreno * 0.02f) - valorTerreno;
            valorTerreno = (valorTerreno * 0.98f);
        }

        System.out.printf("O valor do terreno é: R$ %.2f reais", valorTerreno);
        teclado.close();
    }
}
