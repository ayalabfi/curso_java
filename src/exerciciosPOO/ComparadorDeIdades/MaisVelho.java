package exerciciosPOO.ComparadorDeIdades;

import exerciciosPOO.ComparadorDeIdades.entidades.Idade;

import java.util.Scanner;

public class MaisVelho {

    public static void main(String[] args) {

        System.out.println("Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes\n" +
                "devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome\n" +
                "da pessoa mais velha.");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantas pessoas serão cadastradas: ");
        int n = sc.nextInt();
        String nomeMaisVelho = "";
        int IdadeMaisVelho = 0;

        Idade[] pessoa = new Idade[n];

        for(int i = 0; i < pessoa.length; i++){
            sc.nextLine();
            System.out.printf("Digite o nome da %d pessoa: ", i + 1);
            String nome = sc.nextLine();
            System.out.printf("Digite a idade da %d pessoa: ", i + 1);
            int idade = sc.nextInt();
            pessoa[i] = new Idade(nome, idade);
            if (pessoa[i].getIdade() > IdadeMaisVelho){
                IdadeMaisVelho = pessoa[i].getIdade();
                nomeMaisVelho = pessoa[i].getNome();
            }
        }
        System.out.print("Pessoa mais velha: " + nomeMaisVelho);

    }
}
