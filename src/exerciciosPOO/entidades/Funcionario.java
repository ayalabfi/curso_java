package exerciciosPOO.entidades;

public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double taxa;

    public void aumento(double percentual){
        salarioBruto += salarioBruto * (percentual / 100);
    }
    public double salarioLiquido(){
        return salarioBruto - taxa;
    }

    public String toString() {
        return nome +
                ", $ " + salarioLiquido();
    }

}
