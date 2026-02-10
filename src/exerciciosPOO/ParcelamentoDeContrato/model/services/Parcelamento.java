package exerciciosPOO.ParcelamentoDeContrato.model.services;

import exerciciosPOO.ParcelamentoDeContrato.model.entities.Contrato;
import exerciciosPOO.ParcelamentoDeContrato.model.exceptions.QuantityWrong;

import java.time.format.DateTimeFormatter;

public class Parcelamento {

    DateTimeFormatter currentFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private Contrato contrato;
    private ServicoDePagamento servicoDePagamento;

    public Parcelamento(Contrato contrato, ServicoDePagamento servicoDePagamento) {
        this.contrato = contrato;
        this.servicoDePagamento = servicoDePagamento;
    }

    public void parcelas(int qtdParcelas) {

        if(qtdParcelas < 1){
            throw new QuantityWrong("A quantidade de parcelas não pode ser menor que 1.");
        }

        double valorDividido = contrato.getValor() / qtdParcelas;
        System.out.println("Parcela(s):");

        if (qtdParcelas > 1) {
            for (int i = 1; i <= qtdParcelas; i++) {
                double valorParcela = valorDividido + (servicoDePagamento.jurosSimples() * i * valorDividido);
                valorParcela += valorParcela * servicoDePagamento.jurosPagamento();

                System.out.println(contrato.getData().plusMonths(i).format(currentFormat) + " - " + String.format("%.2f",valorParcela));
            }
        } else {
            System.out.println(contrato.getData().plusMonths(1).format(currentFormat) + " - " + String.format("%.2f", contrato.getValor()));
        }
    }
}
