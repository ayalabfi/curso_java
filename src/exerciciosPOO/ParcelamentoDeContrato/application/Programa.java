package exerciciosPOO.ParcelamentoDeContrato.application;

import exerciciosPOO.ParcelamentoDeContrato.model.entities.Contrato;
import exerciciosPOO.ParcelamentoDeContrato.model.exceptions.QuantityWrong;
import exerciciosPOO.ParcelamentoDeContrato.model.services.Parcelamento;
import exerciciosPOO.ParcelamentoDeContrato.model.services.ServicoPaypal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.println("Entre com os dados do contrato:");
            System.out.print("Número: ");
            int numero = sc.nextInt();
            System.out.print("Data (DD/MM/AAAA): ");
            LocalDate data = LocalDate.parse(sc.next(), fmt);
            sc.nextLine();
            System.out.print("Valor: ");
            double valor = sc.nextDouble();

            Contrato contrato = new Contrato(numero, data, valor);
            Parcelamento parcelamento = new Parcelamento(contrato, new ServicoPaypal());

            System.out.print("\nDeseja parcelar? (s/n): ");
            char decisao = sc.next().charAt(0);
            System.out.println();
            if (decisao == 's') {
                System.out.print("Insira a quantidade de parcelas: ");
                int parcelas = sc.nextInt();
                System.out.println();

                parcelamento.parcelas(parcelas);
            } else {
                parcelamento.parcelas(1);
            }
        }
        catch (DateTimeParseException e) {
            System.out.println("O valor informado não corresponde com o esperado (DD/MM/AAAA)");
        }
        catch (QuantityWrong e) {
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Ocorreu um erro inesperado!");
        }
    }
}
