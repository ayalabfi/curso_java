package exerciciosPOO.PagarFuncionarios.entidades;

public class Trabalhador {

    protected String nome;
    protected Integer horasTrabalhadas;
    protected Double valorHora;

    public Trabalhador(){
    }

    public Trabalhador(String nome, Integer horasTrabalhadas, Double valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double pagamento (){
        return valorHora * horasTrabalhadas;
    }

    public String toString(){
        return nome + " - " + "R$ " + String.format("%.2f", pagamento());
    }
}
