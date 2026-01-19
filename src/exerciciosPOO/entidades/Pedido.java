package exerciciosPOO.entidades;

import exerciciosPOO.entidades.enums.StatusPedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

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
}
