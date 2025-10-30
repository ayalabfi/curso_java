package introducao;

import java.util.Scanner;

public class EstruturaWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = 0;

        while (x != 0) {
            y += x;
            x = scanner.nextInt();
        }
        System.out.println("O valor de y é: " + y);
    }
}
