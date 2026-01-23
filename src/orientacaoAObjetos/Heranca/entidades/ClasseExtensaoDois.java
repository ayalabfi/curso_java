package orientacaoAObjetos.Heranca.entidades;

public class ClasseExtensaoDois extends ClasseHeranca {

    private Double taxaDeJuros;

    public ClasseExtensaoDois(){
        super();
    }

    public ClasseExtensaoDois(Integer numero, String titular, Double saldo, Double taxaDeJuros) {
        super(numero, titular, saldo);
        this.taxaDeJuros = taxaDeJuros  ;
    }

    public Double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(Double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public void atualizarSaldo(){
        saldo += saldo * taxaDeJuros;
    }

    /* No método abaixo, a ação sacar da ClasseHeranca está sendo reescrita nessa classe derivada para
        funcionar de uma forma diferente, é utilizado o @Override para notificar essa sobrescrita/sobreposição
        e conferir se os dados da classe base que estão sendo sobrescritos estão corretos, se o método for
        reescrito sem o Override, ele irá funcionar normalmente, mas o corretor não irá te avisar se alguma
        informação na criação do método estiver divergente do que está escrito na classe base.
     */
    @Override
    public void sacar (double quantia){
        saldo -= quantia;
    }
}
