package orientacaoAObjetos.ClasseAbstrata.entidades;

// O abstract faz com que essa classe não possa ser instânciada
public abstract class Conta {

    private Integer numero;
    private String titular;
    protected Double saldo;

    public Conta(){
    }

    public Conta(Integer numero, String titular, Double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void sacar (double quantia){
        saldo -= quantia + 5;
    }

    public void depositar (double quantia){
        saldo += quantia;
    }
}
