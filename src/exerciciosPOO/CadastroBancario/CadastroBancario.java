package exerciciosPOO.CadastroBancario;

import exerciciosPOO.CadastroBancario.entidades.ExContaBancaria;

import java.util.Scanner;

public class CadastroBancario {

    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    System.out.print("Insira o número da conta: ");
    int conta = teclado.nextInt();
    teclado.nextLine();
    System.out.print("Insira o nome do titular: ");
    String titular = teclado.nextLine();
    System.out.println("Você deseja fazer um deposito inicial? \n" +
            "1 - Sim\n" +
            "2 - Não");

    int decisao = teclado.nextInt();

        ExContaBancaria cliente = null;
    if (decisao == 1) {
        cliente = new ExContaBancaria(conta, titular, teclado);
    } else if (decisao == 2) {
        cliente = new ExContaBancaria(conta, titular);
    } else {
        System.out.println("O valor informado é invalido.");
        System.exit(0);
    }

    boolean pararLoop = false;
    char loop = 0;
    double operacoesBancarias = 0;
    do {
        System.out.println(cliente);
        System.out.println("\nSelecione a opção desejada\n" +
                "1 - Reajustar nome do titular\n" +
                "2 - Depositar\n" +
                "3 - Sacar\n" +
                "4 - Sair");
        loop = teclado.next().charAt(0);
        switch (loop) {
            case '1':
                cliente.setNomeTitular(teclado);
                break;
            case '2':
                cliente.depositar(teclado);
                break;
            case '3':
                cliente.sacar(teclado);
                break;
            case '4':
                pararLoop = true;
                break;
            default:
                System.out.println("\nValor informado não identificado no menu\n");
        }
    } while (!pararLoop);
    System.out.println("Agradecemos por utilizar nossos serviços!");
    }
}
