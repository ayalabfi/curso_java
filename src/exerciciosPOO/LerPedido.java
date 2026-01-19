package exerciciosPOO;

import exerciciosPOO.entidades.ClientePedido;
import exerciciosPOO.entidades.ItemPedido;
import exerciciosPOO.entidades.Pedido;
import exerciciosPOO.entidades.ProdutoPedido;
import exerciciosPOO.entidades.enums.StatusPedido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
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

        Date momento = Date.from(Instant.now());

        ClientePedido cliente = new ClientePedido(nome, email, aniversario);
        Pedido pedido = new Pedido(momento, StatusPedido.valueOf(status), cliente);

        System.out.print("Insira quantos itens serão adicionados ao pedido: ");
        int produtos = sc.nextInt();

        for (int i = 1; i <= produtos; i++){
            System.out.println("Insira os dados do " + i + " produto:");
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
    }
}
