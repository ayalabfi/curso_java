package exerciciosPOO.LerPedido.entidades;

import exerciciosPOO.LerPedido.entidades.enums.StatusPedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momento;
    private StatusPedido status;
    private ClientePedido cliente;
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(){
    }

    public Pedido(Date momento, StatusPedido status, ClientePedido cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public ClientePedido getCliente() {
        return cliente;
    }

    public void setCliente(ClientePedido cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void adicionarItem(ItemPedido item){
        itens.add(item);
    }

    public void removerItem(ItemPedido item){
        itens.remove(item);
    }

    public Double total (){
        double soma = 0;
        for (ItemPedido i : itens){
            soma += i.subtotal();
        }

        return soma;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sumário do pedido:\n");
        sb.append("momento do pedido: " + sdf2.format(momento) + "\n");
        sb.append("Cliente: " + cliente.getNome());
        sb.append(" (" + sdf.format(cliente.getAniversario()) + ") - " + cliente.getEmail() + "\n");
        sb.append("Itens do pedido:\n");
        for (ItemPedido i : itens){
            sb.append(i + "\n");
        }
        sb.append("Preço total: R$" + String.format("%.2f", total()));

        return sb.toString();
    }
}
