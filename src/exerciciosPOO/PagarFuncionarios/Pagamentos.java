package exerciciosPOO.PagarFuncionarios;

import exerciciosPOO.PagarFuncionarios.entidades.Trabalhador;
import exerciciosPOO.PagarFuncionarios.entidades.TrabalhadorTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Pagamentos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantos usuários serão cadastrados: ");
        int quantidadeFuncionarios = sc.nextInt();
        System.out.println();

        List<Trabalhador> funcionarios = new ArrayList<>();

        for (int i = 1; i <= quantidadeFuncionarios; i++){
            System.out.println("Dados do "+ i +"º funcionário:");
            System.out.print("Terceirizado? (s/n): ");
            char terceirizado = sc.next().charAt(0);
            sc.nextLine();
            if (terceirizado == 's'){
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Horas trabalhadas: ");
                int horasTrabalhadas = sc.nextInt();
                sc.nextLine();
                System.out.print("Valor por hora: ");
                double valorHora = sc.nextDouble();
                sc.nextLine();
                System.out.print("Carga adicional: ");
                double cargaAdicional = sc.nextDouble();
                Trabalhador funcionario = new TrabalhadorTerceirizado(nome, horasTrabalhadas, valorHora, cargaAdicional);
                funcionarios.add(funcionario);
            } else if(terceirizado == 'n') {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Horas trabalhadas: ");
                int horasTrabalhadas = sc.nextInt();
                sc.nextLine();
                System.out.print("Valor por hora: ");
                double valorHora = sc.nextDouble();
                Trabalhador funcionario = new Trabalhador(nome, horasTrabalhadas, valorHora);
                funcionarios.add(funcionario);
            } else {
                System.out.println("Valor informado invalido.");
            }
            System.out.println();
        }

        System.out.println("Pagamentos:");

        for (Trabalhador t : funcionarios){
            System.out.println(t);
        }
    }
}
