package Introducao;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {

        // Declaração da variável Scanner (sc)
        Scanner sc = new Scanner(System.in);

        double x;

        //Permite digitar um valor e esse valor ser atribuído a variável x.
        x = sc.nextDouble();

        System.out.println ("Você digitou: " + x);
        sc.close();
    }
}
