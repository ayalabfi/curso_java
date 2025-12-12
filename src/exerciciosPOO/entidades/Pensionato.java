package exerciciosPOO.entidades;

public class Pensionato {

    private String nome;
    private String Email;

    public Pensionato(String nome, String email) {
        this.nome = nome;
        Email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
