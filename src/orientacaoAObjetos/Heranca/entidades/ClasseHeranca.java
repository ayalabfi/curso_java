package orientacaoAObjetos.Heranca.entidades;

public class ClasseHeranca {

    private Integer numero;
    private String titular;
    // protected faz com que o atributo não seja publico, mas possa ser acessado pela classe derivada
    protected Double saldo;

    public ClasseHeranca(){
    }

    public ClasseHeranca(Integer numero, String titular, Double saldo) {
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
