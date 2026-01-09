package Logica;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosComDataHora {

    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        // Subtrai 7 dias da data d01 e salva na variável pastWeekLocalDate (A sintaxe principal é o minus,
        // por meio dele é possível fazer outras operações).
        LocalDate pastWeekLocalDate = d01.minusDays(7);
        // Adiciona 7 dias da data d01 e salva na variável nextWeekLocalDate (A sintaxe principal é o plus,
        // por meio dele é possível fazer outras operações).
        LocalDate nextWeekLocalDate = d01.plusDays(7);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        // A mesma explicação também vale para LocalDateTime
        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        // O Instant funciona quase da mesma forma, no entanto, devido as ações serem mais limitadas
        // diretamente pelo minus e plus, é necessário declarar o tipo de dedução ou adição com ChronoUnit
        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        // Como saber a duração entre uma data e outra
        Duration t1 = Duration.between(pastWeekLocalDateTime, d02);
        /*
         Como LocalDate sem o time não tem o tempo, não é possível saber a duração total entre uma data
         e outra, sendo necessário utilizar o atTime para definir um horário para o cálculo, sendo possível
         substituir o atTime por atStartOfDay (No inicio do dia)
        */
        Duration t2 = Duration.between(pastWeekLocalDate.atTime(0, 0), d01.atStartOfDay());
        Duration t3 = Duration.between(pastWeekInstant, d03);


        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
    }
}
