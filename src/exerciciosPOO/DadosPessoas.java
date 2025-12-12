package exerciciosPOO;

import exerciciosPOO.entidades.DadosPessoais;

import java.util.Scanner;


public class DadosPessoas {

    public static void main(String[] args) {

        System.out.println("Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa\n" +
                "que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número\n" +
                "de homens.");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de pessoas cadastradas: ");
        int n = sc.nextInt();
        double menorAltura = 0;
        double maiorAltura = 0;
        double mediaMulheres = 0;
        int contadorHomens = 0;
        int contadorMulheres = 0;


        DadosPessoais[] pessoas = new DadosPessoais[n];

        for (int i = 0; i < pessoas.length; i++){
            System.out.printf("Digite a altura da %dº pessoa: ", i + 1);
            double altura = sc.nextDouble();
            System.out.printf("Digite o genero da %dº pessoa sendo:\n" +
                    "M - Masculino\n" +
                    "F - Feminino\n", i + 1);
            char sexo = sc.next().charAt(0);

            pessoas[i] = new DadosPessoais(altura, sexo);

            if (pessoas[i].getAltura() < menorAltura || menorAltura == 0){
                menorAltura = pessoas[i].getAltura();
            }

            if (pessoas[i].getAltura() > maiorAltura){
                maiorAltura = pessoas[i].getAltura();
            }

            if (pessoas[i].getSexo() == 'F') {
                mediaMulheres += pessoas[i].getAltura();
                contadorMulheres++;
            }

            if (pessoas[i].getSexo() == 'M') {
                contadorHomens++;
            }
        }

        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        System.out.printf("Media de altura das mulheres = %.2f%n", mediaMulheres / contadorMulheres);
        System.out.printf("Número de homens = %d", contadorHomens);

        sc.close();
    }
}
