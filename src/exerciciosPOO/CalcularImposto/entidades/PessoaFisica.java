package exerciciosPOO.CalcularImposto.entidades;

public class PessoaFisica extends Pessoa{

    private double gastosSaude;

    public PessoaFisica(){
    super();
    }

    public PessoaFisica(String nome, Double rendaAnual, double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double imposto(){
        double taxa = 0;
        if(rendaAnual < 20000){
            taxa = 14.0/100.0;
        } else{
            taxa = 25.0/100.0;
        }

        return (rendaAnual * taxa) - (gastosSaude * 0.5);
    }
}
