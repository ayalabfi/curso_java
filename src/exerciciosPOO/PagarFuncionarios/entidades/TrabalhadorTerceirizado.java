package exerciciosPOO.PagarFuncionarios.entidades;

public class TrabalhadorTerceirizado extends Trabalhador {

    private Double cargaAdicional;

    TrabalhadorTerceirizado(){
        super();
    }

    public TrabalhadorTerceirizado(String nome, Integer horasTrabalhadas, Double valorHora, Double cargaAdicional) {
        super(nome, horasTrabalhadas, valorHora);
        this.cargaAdicional = cargaAdicional;
    }

    public Double getCargaAdicional() {
        return cargaAdicional;
    }

    public void setCargaAdicional(Double cargaAdicional) {
        this.cargaAdicional = cargaAdicional;
    }

    @Override
    public Double pagamento (){
        return (valorHora * horasTrabalhadas) + (cargaAdicional * 1.1);
    }
}
