package exerciciosPOO.ParcelamentoDeContrato.model.services;

import exerciciosPOO.ParcelamentoDeContrato.model.entities.Contrato;

import java.text.SimpleDateFormat;

public interface ServicoDePagamento {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public void taxa(Contrato contrato, int meses);
}
