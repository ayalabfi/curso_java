package exerciciosPOO.ParcelamentoDeContrato.model.services;

import exerciciosPOO.ParcelamentoDeContrato.model.entities.Contrato;

public class ServicoPaypal implements ServicoDePagamento{


    public void taxa(Contrato contrato, int meses) {

        double jurosSimples = 1.0/100.0;
        double taxaPagamento = 2.0/100.0;

        double valorParcela = contrato.getValor() / meses;

        System.out.println("Parcelas:");
        for (int i = 1; i <= meses; i++){
            double parcelaSimples = (valorParcela + (jurosSimples * i * valorParcela));
            double parcelaTotal = parcelaSimples + (parcelaSimples * taxaPagamento);

            System.out.println(sdf.format(contrato.getData().plusMonths(i)) + " - " + String.format("%.2f", parcelaTotal));
        }
    }
}
