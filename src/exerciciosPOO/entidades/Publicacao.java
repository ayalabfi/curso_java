package exerciciosPOO.entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Publicacao {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momento;
    private String titulo;
    private String descricao;
    private Integer curtidas;

    private List<Comentario> comentarios = new ArrayList<>();

    public Publicacao(){
    }

    public Publicacao(Date momento, String titulo, String descricao, Integer curtidas) {
        this.momento = momento;
        this.titulo = titulo;
        this.descricao = descricao;
        this.curtidas = curtidas;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void addComentario(Comentario comentario){
        comentarios.add(comentario);
    }

    public void removerComentario(Comentario comentario){
        comentarios.remove(comentario);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(titulo + "\n");
        sb.append(curtidas);
        sb.append(" Likes - ");
        sb.append(sdf.format(momento) + "\n");
        sb.append(descricao + "\n");
        sb.append("Comentários: \n");
        for (Comentario c : comentarios){
            sb.append(c.getText() + "\n");
        }
        return sb.toString();
    }
}
