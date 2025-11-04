package exerciciosPOO.entidades;

public class Estudante {

    public String alunoNome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double somaNotas() {return nota1 + nota2 + nota3;}
    public String situacao() {
        if (somaNotas() >= 60){
        return "Aprovado!";
        } else {
            return "Reprovado!\nFaltaram "
                    + String.format("%.2f ", 60 - somaNotas()) + "pontos";
        }
    }
    public String toString(){
        return "Nota final: "
                + String.format("%.2f%n", somaNotas())
                + situacao();
    }

}
