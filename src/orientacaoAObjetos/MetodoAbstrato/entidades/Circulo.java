package orientacaoAObjetos.MetodoAbstrato.entidades;

import orientacaoAObjetos.MetodoAbstrato.entidades.enums.Cor;

public class Circulo extends Forma{

    public Double raio;

    public Circulo(){
        super();
    }

    public Circulo(Cor cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    // Como o método da classe base é abstrato, é necessário sobrescreve-lo
    @Override
    public double area(){
        return Math.PI * (Math.pow(raio, 2));
    }
}

