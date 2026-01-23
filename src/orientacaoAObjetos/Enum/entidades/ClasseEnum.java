package orientacaoAObjetos.Enum.entidades;

import orientacaoAObjetos.Enum.entidades.enums.ClasseEnumBase;

import java.util.Date;

public class ClasseEnum {

    private Integer id;
    private Date momento;
    private ClasseEnumBase situacao;

    public ClasseEnum(){
    }

    public ClasseEnum(Integer id, Date momento, ClasseEnumBase situacao) {
        this.id = id;
        this.momento = momento;
        this.situacao = situacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public ClasseEnumBase getSituacao() {
        return situacao;
    }

    public void setSituacao(ClasseEnumBase situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "ClasseEnum{" +
                "id=" + id +
                ", momento=" + momento +
                ", situacao=" + situacao +
                '}';
    }
}
