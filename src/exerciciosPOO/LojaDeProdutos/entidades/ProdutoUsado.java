package exerciciosPOO.LojaDeProdutos.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
    public final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dataDeFabricacao;

    public ProdutoUsado(){
    }

    public ProdutoUsado(String nome, Double preco, Date dataDeFabricacao) {
        super(nome, preco);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public Date getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(Date dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    @Override
    public String tagDeValor(){
        StringBuilder sb = new StringBuilder();
        sb.append(nome + " (usado) ");
        sb.append("R$" + preco);
        sb.append(" (Data de fabricação: " + sdf.format(dataDeFabricacao) + ")");
        return sb.toString();
    }
}
