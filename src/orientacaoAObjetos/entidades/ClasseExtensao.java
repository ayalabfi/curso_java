package orientacaoAObjetos.entidades;

// Significa que a "ClasseHerança" tem todos os comportamentos (atributos e métodos) da "ClasseHerdada"
public class ClasseExtensao extends ClasseHeranca {

    private Double limiteEmprestimo;

    public ClasseExtensao(){
        // Caso alguma lógica seja implementada no construtor da classe base, ela também será implementada na classe derivada
        super();
    }

    // Para o IntelliJ, basta selecionar primeiro o construtor da classe base e depois o construtor da classe derivada.
    // Para o Eclipse, é necessário ao invés de escolher "Generate Constructor", escolher a opção "Generate Constructor
    // using fields".
    public ClasseExtensao(Integer numero, String titular, Double balance, Double limiteEmprestimo) {
        // Chama o construtor da classe base (ClasseHerdada)
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
            // só é possível referenciar o saldo pois ele está como protected, e não como private
            saldo += quantia - 10;
        }
    }

    @Override
    public void sacar (double quantia){
        // Realiza o método normalmente com a regra da classe base
        super.sacar(quantia);
        saldo -= 2;

    }
}
