package introducao;

import java.util.Scanner;

public class CondicionalTernaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o preço:");
        double preco = scanner.nextDouble();
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.printf("O desconto recebido é de R$ %.2f%n", desconto);

        scanner.close();
    }
}
