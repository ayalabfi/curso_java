package exerciciosPOO.GanhosContratuais;

import exerciciosPOO.GanhosContratuais.entidades.ContratoPorHora;
import exerciciosPOO.GanhosContratuais.entidades.Departamento;
import exerciciosPOO.GanhosContratuais.entidades.Trabalhador;
import exerciciosPOO.GanhosContratuais.entidades.enums.NivelDoTrabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class GanhosContratuais {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Insira o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();

        System.out.println("Entre com os dados do trabalhador");
        System.out.print("Nome: ");
        String nomeTrabalhador = sc.nextLine();
        System.out.print("Nivel: ");
        String nivelTrabalhador = sc.nextLine();
        System.out.print("Salário base: ");
        Double salarioBase = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelDoTrabalhador.valueOf(nivelTrabalhador), salarioBase, new Departamento(nomeDepartamento));

        System.out.print("Insira quantos contratos o trabalhador possuirá: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Insira os dados do " + i + "º contrato:");
            System.out.print("Data (DD/MM/AAAA): ");
            Date dataContrato = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valorHora = sc.nextDouble();
            System.out.print("Duração (Horas): ");
            int duracao = sc.nextInt();
            ContratoPorHora contrato = new ContratoPorHora(dataContrato, valorHora, duracao);
            trabalhador.adicionarContrato(contrato);
        }

        System.out.println();
        System.out.println("Entre com o mês e ano para calcular os ganhos (MM/AAAA): ");
        String mesEAno = sc.next();
        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));
        System.out.println();
        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Ganho para " + mesEAno + ": " + String.format("%.2f", trabalhador.ganho(ano, mes)));
        sc.close();
    }
}
