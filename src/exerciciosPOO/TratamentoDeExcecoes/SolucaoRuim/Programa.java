package exerciciosPOO.TratamentoDeExcecoes.SolucaoRuim;

import exerciciosPOO.TratamentoDeExcecoes.SolucaoRuim.modelo.entidades.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Insira o número do quarto: ");
        int quarto = sc.nextInt();
        System.out.print("Insira a data de check-in (DD/MM/AAAA): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Insira a data de check-out (DD/MM/AAAA): ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Erro na reserva: A data de check-out não pode ser anterior a data de check-in!");
        } else {
            Reserva reserva = new Reserva(quarto, checkIn, checkOut);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Insira os dados para atualização da reserva:");
            System.out.print("Insira a data de check-in (DD/MM/AAAA): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Insira a data de check-out (DD/MM/AAAA): ");
            checkOut = sdf.parse(sc.next());


            String erro = reserva.atualizarDatas(checkIn, checkOut);
            if (erro != null) {
                System.out.println("Erro na reserva: " + erro);
            } else {
                System.out.println("Reserva: " + reserva);
            }
        }
        sc.close();
    }
}
