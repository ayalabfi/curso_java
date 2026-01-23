package exerciciosPOO.CalcularImposto;

import exerciciosPOO.CalcularImposto.entidades.Pessoa;
import exerciciosPOO.CalcularImposto.entidades.PessoaFisica;
import exerciciosPOO.CalcularImposto.entidades.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();
        System.out.print("Serão calculadas as taxas de quantas pessoas? ");
        int quantidade = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= quantidade; i++){
            sc.nextLine();
            System.out.println("Insira os dados da " + i + "º pessoa:");
            System.out.print("É pessoa fisica ou pessoa jurídica (PF/PJ)? ");
            String tipoPessoa = sc.nextLine();
            if(tipoPessoa.equals("PF")){
                System.out.print("Insira o nome da pessoa: ");
                String nome = sc.nextLine();
                System.out.print("Insira a renda anual da pessoa: ");
                double rendaAnual = sc.nextDouble();
                System.out.print("Insira os custos com saúde: ");
                double gastosSaude = sc.nextDouble();
                Pessoa pessoa = new PessoaFisica(nome, rendaAnual, gastosSaude);
                pessoas.add(pessoa);
            } else if (tipoPessoa.equals("PJ")) {
                System.out.print("Insira o nome da empresa: ");
                String nome = sc.nextLine();
                System.out.print("Insira a renda anual da empresa: ");
                double rendaAnual = sc.nextDouble();
                System.out.print("Insira a quantidade de funcionários: ");
                int quantidadeFuncionarios = sc.nextInt();
                Pessoa pessoa = new PessoaJuridica(nome, rendaAnual, quantidadeFuncionarios);
                pessoas.add(pessoa);
            } else {
                System.out.println("Tipo digitado não identificado");
            }

            System.out.println();
        }

        System.out.println("Taxas pagas:");

        double total = 0;
        for (Pessoa p : pessoas){
            total += p.imposto();
            System.out.println(p);
        }

        System.out.println();
        System.out.printf("Total de taxas: R$%.2f", total);
    }
}
