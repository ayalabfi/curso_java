package exerciciosPOO.LojaDeProdutos;

import exerciciosPOO.LojaDeProdutos.entidades.Produto;
import exerciciosPOO.LojaDeProdutos.entidades.ProdutoImportado;
import exerciciosPOO.LojaDeProdutos.entidades.ProdutoUsado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Cadastrar {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Produto> produtos = new ArrayList<>();
        System.out.print("Insira a quantidade de produtos a ser cadastrada: ");
        int quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++){
            System.out.println();
            System.out.println("Dados do " + i + "º produto");
            System.out.print("Comum, usado ou importado (c/u/i)? ");
            char tipoDeProduto = sc.next().charAt(0);
            sc.nextLine();

            if (tipoDeProduto == 'c') {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Preço: ");
                double valor = sc.nextDouble();
                Produto produto = new Produto(nome, valor);
                produtos.add(produto);
                System.out.println();
            } else if (tipoDeProduto == 'u') {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Preço: ");
                double valor = sc.nextDouble();
                System.out.print("Data de produção (DD/MM/AAAA): ");
                Date dataProducao = sdf.parse(sc.next());
                Produto produto = new ProdutoUsado(nome, valor, dataProducao);
                produtos.add(produto);
                System.out.println();
            } else if (tipoDeProduto == 'i') {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Preço: ");
                double valor = sc.nextDouble();
                System.out.print("Taxa customizada: ");
                double taxaCustomizada = sc.nextDouble();
                Produto produto = new ProdutoImportado(nome, valor, taxaCustomizada);
                produtos.add(produto);
                System.out.println();
            } else {
                System.out.println("O valor passado é invalido");
            }
        }

        for (Produto p : produtos){
            System.out.println(p.tagDeValor());
        }
    }
}
