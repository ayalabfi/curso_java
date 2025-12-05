package exerciciosPOO.entidades;

import java.util.Scanner;

public class ExContaBancaria {

    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ExContaBancaria (int numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }
    public ExContaBancaria (int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
        }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(Scanner teclado) {
        teclado.nextLine();
        System.out.println("Insira o nome do titular:");
        this.nomeTitular = teclado.nextLine();
    }

    public void sacar(Scanner teclado){
        System.out.println("Insira o valor de saque:");
        double saque = teclado.nextDouble();
        this.saldo -= saque + 5;
    }

    public void depositar(Scanner teclado){
        System.out.println("Insira o valor de depósito: ");
        double deposito = teclado.nextDouble();
        this.saldo += deposito;
    }

    public String toString(){
        return "Número da conta: " + this.numeroConta
                + "\nNome do titular: " + this.nomeTitular
                + String.format("\nSaldo: R$%.2f", this.saldo);
    }
}
