package Logica;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciacaoData {

    public static void main(String[] args) {

        /* Esse comando cria um formatador de leitura de data diferente da ISO 8601
        cujo o padrão recebe o nome fmt1 que deve ser declarado quando for utilizado
        o padrão diferente.
        Doc: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
         */
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Puxa a data local atual
        LocalDate d01 = LocalDate.now();
        // Puxa a data local atual com horário
        LocalDateTime d02 = LocalDateTime.now();
        // Puxa a data hora GMT (Londres)
        Instant d03 = Instant.now();

        // Gera a data local de acordo com a data passada ("AAAA-MM-DD")
        LocalDate d04 = LocalDate.parse("2022-07-20");
        // Gera a data e hora de acordo com a data passada ("AAAA-MM-DDTHH:MM:SS")
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        // Gera a data e hora de acordo com a data passada no horário de Londres
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        // Gera a data e hora de Londres fazendo os ajustes de acordo com o fuso horário passado
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

        // Gera a data de acordo com a data passada na formatação identificada (fmt1)
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        // Gera a data e hora de acordo com a data e hora
        // passada na formatação identificada (fmt2)
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
        // Gera a data e hora de acordo com a data e hora passada na formatação indicada
        // diretamente na declaração.
        LocalDateTime d10 = LocalDateTime.parse("20/07/2022 01:30:42", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        // Gera a data declarando cada parte da data de forma separada
        LocalDate d11 = LocalDate.of(2022, 7, 20);
        // Gera a data declarando cada parte da data, hora, minuto e segundo de forma separada
        LocalDateTime d12 = LocalDateTime.of(2022, 7, 20,11, 30, 42);

        /* É como se tivesse sendo gerado um toString no formato ISO 8601
        Sendo assim, o código abaixo tem a mesma funcionalidade dos demais após ele:
        System.out.println(d01.toString());
         */
        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11);
        System.out.println(d12);


    }
}
