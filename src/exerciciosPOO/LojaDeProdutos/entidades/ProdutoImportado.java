package exerciciosPOO.LojaDeProdutos.entidades;

public class ProdutoImportado extends Produto{

    private Double taxaCustomizada;

    public ProdutoImportado(){
    super();
    }

    public ProdutoImportado(String nome, Double preco, Double taxaCustomizada) {
        super(nome, preco);
        this.taxaCustomizada = taxaCustomizada;
    }

    public Double getTaxaCustomizada() {
        return taxaCustomizada;
    }

    public void setTaxaCustomizada(Double taxaCustomizada) {
        this.taxaCustomizada = taxaCustomizada;
    }

    public Double precoTotal(){
        return preco + taxaCustomizada;
    }

    @Override
    public String tagDeValor(){
        return nome + " R$" + precoTotal() + String.format(" (Taxa customizada: %.2f)", taxaCustomizada);
    }
}
