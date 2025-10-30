package introducao;

import java.util.Scanner;

public class AtribuicaoCumulativa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Uma operadora de telefone cobra R$ 50.00 por um plano básico que\n" + "dá direito a 10 minutos no telefone. Cada minuto que exceder a\n" + "franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a\n" + "quantidade de minutos que uma pessoa consumiu, daí mostrar o valor\n" + "a ser pago.");
        System.out.println("Insira quantos minutos foram utilizados:");
        int minutos = scanner.nextInt();
        double conta = 50.0;

        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta = R$ %.2f%n", conta);
        scanner.close();
    }
}
