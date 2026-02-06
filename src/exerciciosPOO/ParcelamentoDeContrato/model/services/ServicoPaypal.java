package exerciciosPOO.ParcelamentoDeContrato.model.services;

public class ServicoPaypal implements ServicoDePagamento{


    public Double taxa(double valor, int meses) {

        double jurosSimples = 1.0/100.0;
        double taxaPagamento = 2.0/100.0;

        double valorParcela = valor / meses;

        Double taxa = jurosSimples;

        for (int i = 1; i <= meses; i++){
            double calculo = (valorParcela) + (valorParcela * taxa);
            calculo += calculo * taxaPagamento;
        }
    }
}
