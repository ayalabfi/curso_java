package exerciciosPOO.CalcularImposto.entidades;

public class PessoaJuridica extends Pessoa{

    private int quantidadeFuncionarios;

    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, int quantidadeFuncionarios) {
        super(nome, rendaAnual);
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    @Override
    public double imposto(){
        double taxa = 0;
        if(quantidadeFuncionarios > 10){
            taxa = 14.0/100.0;
        } else {
            taxa = 16.0/100.0;
        }
        return rendaAnual * taxa;
    }
}
