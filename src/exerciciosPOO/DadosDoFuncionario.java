package exerciciosPOO;

import exerciciosPOO.entidades.Funcionario;

import java.util.Scanner;

public class DadosDoFuncionario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Insira o nome do funcionário: ");
        funcionario.nome = scanner.nextLine();
        System.out.print("Insira o salário bruto: ");
        funcionario.salarioBruto = scanner.nextDouble();
        System.out.print("Insira o total de deduções: ");
        funcionario.taxa = scanner.nextDouble();

        System.out.println("Dados do funcionário: " + funcionario);

        System.out.print("Insira o valor a ser aumentado em percentual: ");
        double aumento = scanner.nextDouble();
        funcionario.aumento(aumento);

        System.out.print("Dados atualizados: " + funcionario);
    }
}
