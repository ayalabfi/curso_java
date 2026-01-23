package exerciciosPOO.LerPedido;

import exerciciosPOO.LerPedido.entidades.ClientePedido;
import exerciciosPOO.LerPedido.entidades.ItemPedido;
import exerciciosPOO.LerPedido.entidades.Pedido;
import exerciciosPOO.LerPedido.entidades.ProdutoPedido;
import exerciciosPOO.LerPedido.entidades.enums.StatusPedido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class LerPedido {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Insira os dados do cliente");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.println("Aniversário (DD/MM/AAAA): ");
        Date aniversario = sdf.parse(sc.nextLine());
        System.out.println();
        System.out.print("Insira o status do pedido: ");
        String status = sc.nextLine();
        System.out.println();

        Date momento = Date.from(Instant.now());

        ClientePedido cliente = new ClientePedido(nome, email, aniversario);
        Pedido pedido = new Pedido(momento, StatusPedido.valueOf(status), cliente);

        System.out.print("Insira quantos itens serão adicionados ao pedido: ");
        int produtos = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= produtos; i++){
            System.out.println("Insira os dados do " + i + "º produto:");
            sc.nextLine();
            System.out.print("Nome do produto: ");
            String produtoNome = sc.nextLine();
            System.out.print("Preço do produto: ");
            double produtoPreco = sc.nextDouble();
            System.out.print("Quantidade: ");
            int produtoQuantidade = sc.nextInt();

            ProdutoPedido produto = new ProdutoPedido(produtoNome, produtoPreco);
            ItemPedido item = new ItemPedido(produtoQuantidade, produto);
            pedido.adicionarItem(item);
        }
        System.out.println(pedido);
    }
}
