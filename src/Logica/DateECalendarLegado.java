package Logica;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DateECalendarLegado {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        // Cria um novo calendário
        Calendar cal = Calendar.getInstance();
        // Instancia a data d no calendario
        cal.setTime(d);
        // Adiciona 4 horas na data instanciada
        cal.add(Calendar.HOUR_OF_DAY, 4);
        // Equipara a data d a data instanciada no calendario
        d = cal.getTime();

        System.out.println(sdf.format(d));

        // Voltando d a data e hora inicial
        d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        cal.setTime(d);
        // Gravando o valor dos minutos da data passada
        int minutos = cal.get(Calendar.MINUTE);
        // Lembrando que os meses começam a contar de 0, para normalizar, basta colocar + 1, conforme abaixo
        int mes = cal.get(Calendar.MONTH) + 1;

        System.out.println("Minutos = " + minutos);
        System.out.println("Mês = " + mes);
    }
}
