package orientacaoAObjetos.ClasseAbstrata.entidades;

public class ContaEmpresarial extends Conta {

    private Double limiteEmprestimo;

    public ContaEmpresarial(){
        super();
    }

    public ContaEmpresarial(Integer numero, String titular, Double balance, Double limiteEmprestimo) {
        super(numero, titular, balance);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(Double quantia){
        if (limiteEmprestimo >= quantia) {
            saldo += quantia - 10;
        }
    }

    @Override
    public void sacar (double quantia){
        super.sacar(quantia);
        saldo -= 2;

    }
}
