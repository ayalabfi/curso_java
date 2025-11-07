package exerciciosPOO;

import exerciciosPOO.entidades.ContaBancaria;

import java.util.Scanner;

public class OperacoesBancárias {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();
        System.out.println("Você deseja adicionar um saldo inicial?\n" +
                "1 - Sim\n" +
                "2 - Não");
        int decisao = scanner.nextInt();

        ContaBancaria cliente;
        if (decisao == 1) {
            System.out.print("Insira o valor inicial: ");
            double depositoInicial = scanner.nextDouble();
            cliente = new ContaBancaria(conta, titular, depositoInicial);
        } else {
            cliente = new ContaBancaria(conta, titular);
        }
        int valor = 0;
        do {
            System.out.println("Dados atuais: " + cliente);
            System.out.println("Menu\n" +
                    "1 - Alterar nome do titular\n" +
                    "2 - Realizar depósito\n" +
                    "3 - Realizar saque\n" +
                    "0 - Sair");
            decisao = scanner.nextInt();
            switch (decisao) {
                case 0:
                    System.out.print("Obrigado por utilizar nossos serviços!");
                    break;
                case 1:
                    cliente.setNomeTitular(scanner, titular);
                    break;
                case 2:
                    cliente.fazerDeposito(scanner, valor);
                    break;
                case 3:
                    cliente.fazerSaque(scanner, valor);
            }

        } while (decisao != 0);
        System.out.print("Obrigado por utilizar nossos serviços!");
    }
}
