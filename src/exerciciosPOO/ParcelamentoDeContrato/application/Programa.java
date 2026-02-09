package exerciciosPOO.ParcelamentoDeContrato.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.println("Entre com os dados do contrato:");
            System.out.print("Número: ");
            int numero = sc.nextInt();
            System.out.println("Data (DD/MM/AAAA): ");
            LocalDate data = fmt.parse();

        }
        catch (ParseException e){

        }

    }
}
