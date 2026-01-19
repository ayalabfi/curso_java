package exerciciosPOO.entidades;

public class ItemPedido {

    private Integer quantidade;
    private ProdutoPedido produto;

    public ItemPedido(){
    }

    public ItemPedido(Integer quantidade, ProdutoPedido produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public ProdutoPedido getProduto() {
        return produto;
    }

    public void setProduto(ProdutoPedido produto) {
        this.produto = produto;
    }

    public Double subtotal (){
        return quantidade * produto.getPreco();
    }

    public String toString(){
        return produto.getNome() + ", "
                + String.format("R$%.2f", produto.getPreco()) + ", "
                + "Quantidade: " + quantidade + ", "
                + "Subtotal: R$" + String.format("%.2f", subtotal());
    }
}
