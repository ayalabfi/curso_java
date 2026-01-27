package exerciciosPOO.TratamentoDeExcecoes.SolucaoBoa;

import exerciciosPOO.TratamentoDeExcecoes.SolucaoBoa.modelo.entidades.Reserva;
import exerciciosPOO.TratamentoDeExcecoes.SolucaoBoa.modelo.excecoes.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Insira o número do quarto: ");
            int quarto = sc.nextInt();
            System.out.print("Insira a data de check-in (DD/MM/AAAA): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Insira a data de check-out (DD/MM/AAAA): ");
            Date checkOut = sdf.parse(sc.next());


            Reserva reserva = new Reserva(quarto, checkIn, checkOut);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Insira os dados para atualização da reserva:");
            System.out.print("Insira a data de check-in (DD/MM/AAAA): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Insira a data de check-out (DD/MM/AAAA): ");
            checkOut = sdf.parse(sc.next());


            reserva.atualizarDatas(checkIn, checkOut);
            System.out.println("Reserva: " + reserva);
        }
        catch (ParseException e) {
            System.out.println("Formato de data invalido");
        }
        catch (DomainException e) {
            System.out.println("Erro na reserva: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Erro inesperado!");
        }

        sc.close();
    }
}
