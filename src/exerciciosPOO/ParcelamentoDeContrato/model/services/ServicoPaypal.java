package exerciciosPOO.ParcelamentoDeContrato.model.services;


public class ServicoPaypal implements ServicoDePagamento{


    public Double jurosSimples() {

        return 1.0/100.0;

    }

    public Double jurosPagamento(){

        return 2.0/100.0;
    }
}
