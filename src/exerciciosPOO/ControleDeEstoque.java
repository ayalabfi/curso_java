package exerciciosPOO;

import exerciciosPOO.entidades.Produto;

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

        System.out.println("Dados do produto:\n" + produto);

        System.out.println("Entre com o número de produtos adicionados ao estoque: ");

        int quantidade = scanner.nextInt();
        produto.adicionarProdutos(quantidade);

        System.out.println("Dados do produto atualizados:\n" + produto);

        quantidade = scanner.nextInt();
        produto.removerProdutos(quantidade);

        System.out.println("Dados do produto atualizados:\n" + produto);

        scanner.close();
    }
}
