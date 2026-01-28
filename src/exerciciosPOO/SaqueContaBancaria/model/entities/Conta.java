package exerciciosPOO.SaqueContaBancaria.model.entities;

import exerciciosPOO.SaqueContaBancaria.model.exceptions.ValueAboveException;
import exerciciosPOO.TratamentoDeExcecoes.SolucaoBoa.modelo.excecoes.DomainException;

public class Conta {

    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

    public Conta(){

    }

    public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if (valor > limiteSaque){
            throw new ValueAboveException ("O valor de saque é superior ao limite de saque!");
        }
        if (saldo < valor){
            throw new ValueAboveException ("Você não tem esse valor disponível!");
        }
        saldo -= valor;
        System.out.printf("Saldo atualizado: %.2f", saldo);
    }
}
