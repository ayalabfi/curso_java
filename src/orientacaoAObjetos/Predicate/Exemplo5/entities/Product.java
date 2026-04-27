package orientacaoAObjetos.Predicate.Exemplo5.entities;

public class Product {

    private String nome;
    private Double valor;

    public Product(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public boolean nonStaticProductPredicate() {

        return valor >= 100;
    }

    @Override
    public String toString() {
        return nome + ": " + valor;
    }
}
