package exerciciosPOO.LojaDeProdutos;

import exerciciosPOO.LojaDeProdutos.entidades.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Cadastrar {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> produtos = new ArrayList<>();
        System.out.print("Insira a quantidade de produtos a ser cadastrada: ");
        int quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++){
            System.out.println();
            System.out.println("Dados do " + i + "º produto");
            System.out.println("Comum, usado ou importado (c/u/i)?");
            char tipoDeProduto = sc.next().charAt(0);
            sc.nextLine();

            if (tipoDeProduto == 'c') {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Preço: ");
                double valor = sc.nextDouble();
                System.out.println();
            } else if (tipoDeProduto == 'u') {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Preço: ");
                double valor = sc.nextDouble();
                System.out.print("Data de produção (DD/MM/AAAA): ");
                System.out.println();
            } else if (tipoDeProduto == 'i') {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Preço: ");
                double valor = sc.nextDouble();
                System.out.println();
            } else {
                System.out.println("O valor passado é invalido");
            }
        }
    }
}
