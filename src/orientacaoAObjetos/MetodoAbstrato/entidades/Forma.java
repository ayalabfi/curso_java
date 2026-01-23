package orientacaoAObjetos.MetodoAbstrato.entidades;

import orientacaoAObjetos.MetodoAbstrato.entidades.enums.Cor;

public abstract class Forma {

    private Cor cor;

    public Forma(){
    }

    public Forma(Cor cor) {
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    // Se o método é abstrato, obrigatóriamente a classe também tem que ser abstrata
    public abstract double area();
}
