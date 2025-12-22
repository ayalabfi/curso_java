package exerciciosPOO;

import exerciciosPOO.entidades.FuncionarioLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncionarioAumento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<FuncionarioLista> funcionarios = new ArrayList<>();

        System.out.print("Insira a quantidade de funcionários a serem digitados: ");
        int n = sc.nextInt();

        for (int i = 0 ; i < n; i++){

            System.out.print("Digite o ID do funcionário: ");
            int id = sc.nextInt();
            while (hasId(funcionarios, id)) {
                System.out.println("Esse ID já foi informado, tente novamente.");
                id = sc.nextInt();
            }
            System.out.print("Digite o nome do funcionário: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Digite o salário do funcionário: ");
            double salario = sc.nextDouble();

            ;
            funcionarios.add(new FuncionarioLista(id, nome, salario));
        }

        System.out.println("Insira o código do funcionário que receberá um aumento: ");
        int id = sc.nextInt();
        FuncionarioLista fun = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (fun == null) {
            System.out.println("Esse funcionário não foi cadastrado.");
        }
        else {
            System.out.println("Insira em porcentagem o aumento: ");
            double porcentagemAumento = sc.nextDouble();
            fun.aumento(porcentagemAumento);
        }

        System.out.println("Lista de funcionários:");
        for ( FuncionarioLista obj : funcionarios) {
            System.out.println(obj);
        }
        sc.close();
    }

    private static boolean hasId(List<FuncionarioLista> funcionarios, int id) {
        FuncionarioLista fun = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return fun != null;
    }
}
