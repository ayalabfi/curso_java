package introducao;

import java.util.Scanner;

public class EstruturaFor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de números a serem somados");
        int N = scanner.nextInt();

        int soma = 0;

        System.out.println("Digite os números da soma");
        for (int i = 0; i < N; i++){

            int x = scanner.nextInt();
            soma += x;
        }
        System.out.println("Resultado: "+ soma);
    }
}
