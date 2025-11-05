package orientacaoAObjetos.entidades;

public class ClasseConstrutores {

    // Atributos
    public String nome;
    public double preco;
    public int quantidade;

    // Construtor - Por convenção, é recomendado utilizar os mesmos nomes dos atributos
    public ClasseConstrutores(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Sobrecarga - Criando o mesmo construtor anterior mas sem obrigatoriedade da quantidade
    public ClasseConstrutores(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        /* quantidade pode ser iniciada com 0, no entanto, em Java, numeros de objetos e Arrays são
        iniciados com 0, e como não foi criado um atributo local, mesmo sem o this, a quantidade
        referenciada seria a do objeto.
        this.quantidade = 0; ou quantidade = 0;
         */
    }
    /* Criando um construtor padrão caso não seja declarado parâmetros, podendo ser referenciado
    antes de declarar as variáveis no programa */
    public ClasseConstrutores(){

    }
    // declaração de um método com prefixo, tipo de dado retornado, nome do método e parâmetros
    public double valorTotalEmEstoque() {

        return preco * quantidade;
    }

    public void adicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }
    // Mudança na saída de dados do objeto para o formato designado no método (acontece ao criar o método
    //  toString)
    public String toString() {
        return nome
                + ", $ "
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidades, total: $ "
                + String.format("%.2f", valorTotalEmEstoque());
    }
}
