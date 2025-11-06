package orientacaoAObjetos;

import orientacaoAObjetos.entidades.ClasseEncapsulamento;

import java.util.Scanner;

public class ProgramaEncapsulamento {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ClasseEncapsulamento produto1 = new ClasseEncapsulamento();

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço: ");
        double preco = scanner.nextDouble();

        /* indicando que o atributo nome da classe ClasseEncapsulamento receberá o valor da String
        nome da classe ProgramaEncapsulamento por meio do Setter*/
        produto1.setNome(nome);
        /* indicando que o atributo preco da classe ClasseEncapsulamento receberá o valor do double
        preco da classe ProgramaEncapsulamento por meio do Setter*/
        produto1.setPreco(preco);
        /* indicando que o atributo nome da classe ClasseEncapsulamento será impresso por meio do
         Getter*/
        System.out.println(produto1.getNome());
        /* indicando que o atributo preco da classe ClasseEncapsulamento será impresso por meio do
         Getter*/
        System.out.println(produto1.getPreco());

    }
}
