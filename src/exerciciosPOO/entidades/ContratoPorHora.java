package exerciciosPOO.entidades;

import java.util.Date;

public class ContratoPorHora {

    private Date data;
    private Double valorPorHora;
    private Integer duracao;

    public ContratoPorHora(){
    }

    public ContratoPorHora(Date data, Double valorPorHora, Integer duracao) {
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.duracao = duracao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public double valorTotal(){
        return valorPorHora * duracao;
    }
}
