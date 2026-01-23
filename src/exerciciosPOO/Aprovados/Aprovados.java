package exerciciosPOO.Aprovados;

import exerciciosPOO.Aprovados.entidades.Notas;

import java.util.Scanner;

public class Aprovados {

    public static void main(String[] args) {

        System.out.println("Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram\n" +
                "no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir\n" +
                "os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou\n" +
                "igual a 6.0 (seis).");

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantos alunos serão informados: ");
        int n = sc.nextInt();

        Notas[] alunos = new Notas[n];

        for (int i = 0; i < alunos.length; i++){
            sc.nextLine();
            System.out.printf("Digite o nome do %dº aluno: ", i + 1);
            String nome = sc.nextLine();
            System.out.printf("Digite a 1º nota do %dº aluno: ", i + 1);
            double notaUm = sc.nextDouble();
            System.out.printf("Digite a 2º nota do %dº aluno: ", i + 1);
            double notaDois = sc.nextDouble();

            alunos[i] = new Notas(nome, notaUm, notaDois);
        }

        System.out.println("Alunos aprovados:");

        for (int i = 0; i < alunos.length; i++){
            double media = (alunos[i].getPrimeiraNota() + alunos[i].getSegundaNota()) / 2;
            if (media >= 6) {
                System.out.println(alunos[i].getNome());
            }
        }
    }
}
