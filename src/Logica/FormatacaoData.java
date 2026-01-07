package Logica;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatacaoData {

    public static void main(String[] args) {

        //doc: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Mostra a data de acordo com a formatação declarada, ambas as formas funcionam
        System.out.println("d01 = " + d01.format(fmt1));
        System.out.println("d01 = " + fmt1.format(d01));
        System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("d02 = " + d02.format(fmt1));
        System.out.println("d02 = " + d02.format(fmt2));

        // Foarmatador com fuso horário declarado de acordo com o sistema operacional do
        // usuário
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        // Devido a ter uma fuso horário declarado no d03, é necessário criar uma formatação
        // com fuso horário declarado.
        System.out.println("d03 = " + fmt3.format(d03));

    }
}
