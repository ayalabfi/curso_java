package exerciciosPOO.SaqueContaBancaria;

import exerciciosPOO.SaqueContaBancaria.model.entities.Conta;
import exerciciosPOO.SaqueContaBancaria.model.exceptions.ValueAboveException;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Insira os dados da conta:");
            System.out.print("Número: ");
            int numero = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome do titular: ");
            String nome = sc.nextLine();
            System.out.print("Saldo inicial: ");
            double saldo = sc.nextDouble();
            System.out.print("Limite de saque: ");
            double limiteSaque = sc.nextDouble();

            Conta conta = new Conta(numero, nome, saldo, limiteSaque);

            System.out.println();
            System.out.print("Insira o valor de saque: ");
            double saque = sc.nextDouble();
            conta.sacar(saque);
        }
        catch (ValueAboveException e) {
            System.out.println("Falha no procedimento de saque: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Ocorreu um erro inesperado!");
        }
    }
}
