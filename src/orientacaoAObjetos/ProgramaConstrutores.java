package orientacaoAObjetos;

// Importando o objeto ClasseConstrutores
import orientacaoAObjetos.entidades.ClasseConstrutores;

import java.util.Scanner;

public class ProgramaConstrutores {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados do produto:");
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        /* comentado para chamar o construtor da sobrecarga
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        */

        /* Criando uma instância do objeto ClasseConstrutores e referenciando os construtores,
        após isso, chamando a sobrecarga após comentar o parâmetro quantidade*/
        ClasseConstrutores produto = new ClasseConstrutores(nome, preco/*, quantidade */);

        System.out.println("Dados do produto:\n" + produto);

        System.out.println("Entre com o número de produtos adicionados ao estoque: ");

        int quantidade = scanner.nextInt();
        // Chamando o método
        produto.adicionarProdutos(quantidade);

        System.out.println("Dados do produto atualizados:\n" + produto);

        quantidade = scanner.nextInt();
        produto.removerProdutos(quantidade);

        System.out.println("Dados do produto atualizados:\n" + produto);

        scanner.close();
    }
}
