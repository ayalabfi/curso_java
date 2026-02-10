package exerciciosPOO.ParcelamentoDeContrato.application;

import exerciciosPOO.ParcelamentoDeContrato.model.entities.Contract;
import exerciciosPOO.ParcelamentoDeContrato.model.services.InstallmentService;
import exerciciosPOO.ParcelamentoDeContrato.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato:");
        System.out.print("Número: ");
        int number = scanner.nextInt();
        System.out.print("Data (DD/MM/AAAA): ");
        LocalDate date = LocalDate.parse(scanner.next(), format);
        System.out.print("Valor do contrato: ");
        double contractValue = scanner.nextDouble();
        System.out.print("Insira o número de parcelas: ");
        int InstallmentQuantity = scanner.nextInt();

        Contract contract = new Contract(number, date, contractValue);
        InstallmentService installmentService = new InstallmentService(contract, new PaypalService(), InstallmentQuantity);
        installmentService.Installment();

        System.out.println(contract);
    }
}
