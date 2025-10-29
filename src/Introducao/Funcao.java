package Introducao;

import java.util.Scanner;

public class Funcao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int higher = max(a, b, c);

        showResult(higher);

        scanner.close();
    }

    public static int max(int x, int y, int z){
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println ("Higher = " + value);
    }
}
