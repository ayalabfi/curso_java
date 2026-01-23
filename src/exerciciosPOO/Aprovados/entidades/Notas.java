package exerciciosPOO.Aprovados.entidades;

public class Notas {

    private String nome;
    private double PrimeiraNota;
    private double SegundaNota;

    public Notas(String nome, double primeiraNota, double segundaNota) {
        this.nome = nome;
        PrimeiraNota = primeiraNota;
        SegundaNota = segundaNota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrimeiraNota() {
        return PrimeiraNota;
    }

    public void setPrimeiraNota(double primeiraNota) {
        PrimeiraNota = primeiraNota;
    }

    public double getSegundaNota() {
        return SegundaNota;
    }

    public void setSegundaNota(double segundaNota) {
        SegundaNota = segundaNota;
    }

}
