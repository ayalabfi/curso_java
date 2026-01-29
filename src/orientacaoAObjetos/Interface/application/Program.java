package orientacaoAObjetos.Interface.application;

import orientacaoAObjetos.Interface.model.entities.AluguelDeCarro;
import orientacaoAObjetos.Interface.model.entities.Veiculo;
import orientacaoAObjetos.Interface.model.services.ServicoDeAluguel;
import orientacaoAObjetos.Interface.model.services.TaxaDeServicoBrasileira;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel:");
        System.out.print("Modelo do carro: ");
        String carroModelo = sc.nextLine();
        System.out.print("Retirada (dd/mm/aaaa hh:mm): ");
        LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/mm/aaaa hh:mm): ");
        LocalDateTime fim = LocalDateTime.parse(sc.nextLine(), fmt);

        AluguelDeCarro carro = new AluguelDeCarro(inicio, fim, new Veiculo(carroModelo));

        System.out.print("Insira o preço por hora: ");
        double precoPorHora = sc.nextDouble();
        System.out.print("Insira o preco por dia: ");
        double precoPorDia = sc.nextDouble();

        ServicoDeAluguel servicoDeAluguel = new ServicoDeAluguel(precoPorHora, precoPorDia, new TaxaDeServicoBrasileira());

        servicoDeAluguel.processarFatura(carro);

        System.out.println("Fatura:");
        System.out.println("Pagamento básico: " + String.format("%.2f", carro.getFatura().getPagamentoBasico()));
        System.out.println("Imposto: " + String.format("%.2f", carro.getFatura().getTaxa()));
        System.out.println("Pagamento total: " + String.format("%.2f", carro.getFatura().getPagamentoTotal()));

        sc.close();
    }
}
