package orientacaoAObjetos.Interface.model.services;

import orientacaoAObjetos.Interface.model.entities.AluguelDeCarro;
import orientacaoAObjetos.Interface.model.entities.Fatura;

import java.time.Duration;

public class ServicoDeAluguel {

    private Double precoPorHora;
    private Double precoPorDia;

    private TaxaDeServico taxaDeServico;

    public ServicoDeAluguel(Double precoPorHora, Double precoPorDia, TaxaDeServico taxaDeServico) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.taxaDeServico = taxaDeServico;
    }

    public void processarFatura(AluguelDeCarro aluguelDeCarro){

        double minutos = Duration.between(aluguelDeCarro.getInicio(), aluguelDeCarro.getFim()).toMinutes();
        double horas  = minutos/60;

        double pagamentoBasico;
        if (horas <= 12.0){
            // Math.ceil arredonda sempre para cima.
            pagamentoBasico = precoPorHora * Math.ceil(horas);
        } else {
            pagamentoBasico = precoPorDia * Math.ceil(horas / 24.0);
        }

        double taxa = taxaDeServico.taxa(pagamentoBasico);

        aluguelDeCarro.setFatura(new Fatura(pagamentoBasico, taxa));
    }
}
