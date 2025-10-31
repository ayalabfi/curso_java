package exercicios;

import exercicios.entidades.Produto;

import java.util.Scanner;

public class ControleDeEstoque {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("Digite os dados do produto:");
        System.out.print("Nome do produto: ");
        produto.nome = scanner.nextLine();
        System.out.print("Preço: ");
        produto.preco = scanner.nextDouble();
        System.out.print("Quantidade: ");
        produto.quantidade = scanner.nextInt();

        System.out.printf("%s, %.2f, %d", produto.nome, produto.preco, produto.quantidade);
        scanner.close();
    }
}
