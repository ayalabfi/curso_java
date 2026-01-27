package exerciciosPOO.TratamentoDeExcecoes.SolucaoBoa.modelo.excecoes;

public class DomainException extends RuntimeException{

    public DomainException (String msg){
        super(msg);
    }
}
