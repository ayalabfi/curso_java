package exerciciosPOO.entidades;

import java.util.Scanner;

public class ContaBancaria {

    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }
    public ContaBancaria(int numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(Scanner scanner,String nomeTitular) {
        System.out.print("Digite o nome do titular atualizado: ");
        scanner.nextLine();
        nomeTitular = scanner.nextLine();
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }
    public void fazerDeposito(Scanner scanner,double adicionar){
        System.out.print("Insira o valor a ser adicionado: ");
        adicionar = scanner.nextDouble();
        this.saldo += adicionar;
    }
    public void fazerSaque(Scanner scanner, double remover){
        System.out.print("Insira o valor a ser sacado: ");
        remover = scanner.nextDouble();
        this.saldo -= remover + 5;
    }
    public String toString(){
        return "Número da conta: " + getNumeroConta()
                + "\nNome do titular: " + getNomeTitular()
                + "\nSaldo: " + getSaldo();
    }
}
