package exerciciosPOO;

import exerciciosPOO.entidades.Comentario;
import exerciciosPOO.entidades.Publicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Publicador {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Scanner sc = new Scanner(System.in);

        Comentario c1 = new Comentario("Tenha uma boa viagem!");
        Comentario c2 = new Comentario("Olha, isso é demais!");
        Publicacao p1 = new Publicacao(sdf.parse("21/06/2018 13:05:44"),
                "Viajando para Nova Zelandia",
                "Estou indo visitar um país maravilhoso!",
                12);
        p1.addComentario(c1);
        p1.addComentario(c2);

        Comentario c3 = new Comentario("Boa noite!");
        Comentario c4 = new Comentario("Que a força esteja com você!");
        Publicacao p2 = new Publicacao(sdf.parse("28/07/2018 23:14:19"),
                "Boa noite pessoal!",
                "Vejo vocês amanhã!",
                5);
        p2.addComentario(c3);
        p2.addComentario(c4);

        System.out.println(p1);
        System.out.println(p2);
        sc.close();
    }
}
