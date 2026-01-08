package Logica;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConverterDataGlobalParaLocal {

    static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        /* Para converter uma data-hora global para local, além da data-hora global, é
         necessário informar o timezone (sistema local).
         */

        /*ZoneId.getAvailableZoneIds(); -> Retorna uma coleção dos nomes dos fusos horários
         customizados, exemplo de uso abaixo:
        for (String s : ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }
         */

        // Converte a data global em data local com o timezone do Sistema Operacional
        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        /* Converte a data global em data local usando o timezone do id informado, para pegar
        os Ids disponíveis, utilizar o seguinte código:
        ZoneId.getAvailableZoneIds(); conforme explicado mais acima.
         */
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal") );
        // Converte a data global em data local com o timezone do Sistema com horário
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        // Converte a data global em data local usando o timezone do id informado com horário
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));


        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);
        System.out.println("R3 = " + r3);
        System.out.println("R4 = " + r4);

        // Como conseguir os dados separados de uma data abaixo:
        System.out.println("d02 dia = " + d02.getDayOfMonth());
        System.out.println("d02 mês = " + d02.getMonthValue());
        System.out.println("d02 ano = " + d02.getYear());
        System.out.println("d02 hora = " + d02.getHour());
        System.out.println("d02 minuto = " + d02.getMinute());
        System.out.println("d02 segundo = " + d02.getSecond());

    }
}
