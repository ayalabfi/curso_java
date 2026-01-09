package Logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class DateLegado {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        // Muda o time zone, no exemplo abaixo, para GMT
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:42:07");
        // Utiliza o Instant para passar a data em formato UTC com a ISO 8601, mas ao exibi-la,
        // ocorre a formatação para o TimeZone local, sendo UTC -3 para o fuso horário de São Paulo.
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        // Cria uma data com horário atual
        Date z1 = new Date();
        // Pega o instante do sistema, transforma em milisegundos e transforma na data e hora atual
        Date z2 = new Date(System.currentTimeMillis());
        // Pega a data de acordo com o milisegundo passado e transforma em data, com o fuso horário
        // do sistema, nesse caso, 01/01/1970 00:00:00 UTC - 03:00, que resulta em 31:12:1969 21:00:00
        Date z3 = new Date(0L);
        // Para apresentar o dia 01/01/1970 05:00:00 UTC - 03:00, é necessário passar esse tempo em milisegundos,
        // que seria feito da seguinte forma:
        Date z4 = new Date(1000L * 60L * 60L * 5L);
        // Obs.: 1000L = 1 segundo em milisegundos

        System.out.println("Horários sem utilizar formatação");
        System.out.println("y1 = " + y1);
        System.out.println("y2 = " + y2);
        System.out.println("y3 = " + y3);
        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);
        System.out.println("z3 = " + z3);
        System.out.println("z4 = " + z4);
        System.out.println();
        System.out.println("Horários utilizando o timezone do sistema");
        System.out.println("y1 = " + sdf1.format(y1));
        System.out.println("y2 = " + sdf2.format(y2));
        System.out.println("y3 = " + sdf2.format(y3));
        System.out.println("z1 = " + sdf2.format(z1));
        System.out.println("z2 = " + sdf2.format(z2));
        System.out.println("z3 = " + sdf2.format(z3));
        System.out.println("z4 = " + sdf2.format(z4));
        System.out.println();
        System.out.println("Horários utilizando o timezone passado no sdf3");
        System.out.println("y1 = " + sdf3.format(y1));
        System.out.println("y2 = " + sdf3.format(y2));
        System.out.println("y3 = " + sdf3.format(y3));
        System.out.println("z1 = " + sdf3.format(z1));
        System.out.println("z2 = " + sdf3.format(z2));
        System.out.println("z3 = " + sdf3.format(z3));
        System.out.println("z4 = " + sdf3.format(z4));

    }
}
