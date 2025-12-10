package orientacaoAObjetos;

import orientacaoAObjetos.entidades.ClasseArray;

import java.util.Scanner;

public class ProgramaArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de produtos a ser cadastrada: ");
        int n = sc.nextInt();

        ClasseArray[] vetor = new ClasseArray[n];

        for (int i = 0; i < vetor.length; i++) {

            sc.nextLine();
            System.out.printf("Insira o nome do %dº produto: ", i + 1);
            String nome = sc.nextLine();

            System.out.printf("Insira o valor do %dº produto: ", i + 1);
            double preco = sc.nextDouble();

            vetor[i] = new ClasseArray(nome, preco);
        }

        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i].getPreco();
        }

        double media = soma / vetor.length;

        System.out.printf("Valor médio: R$ %.2f", media);

        sc.close();

    }
}
