package orientacaoAObjetos.entidades;

public class ClasseEncapsulamento {

    /* private indica que o atributo não poderá ser acessado por si só por outra classe, assim,
    encapsulando-o */
    private String nome;
    private double preco;

    // get é o parâmetro que antecede o nome do atributo a ser consultado em outra classe
    public double getPreco() {
        return preco;
    }
    // set é o parâmetro que antecede o nome do atributo a ser definido em outra classe
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
