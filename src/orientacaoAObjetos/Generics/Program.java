package orientacaoAObjetos.Generics;

import orientacaoAObjetos.Generics.services.PrintService;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores serão digitados? ");
        int quantity = sc.nextInt();

        PrintService<Integer> ps = new PrintService<>();
        for(int i = 0; i < quantity; i++){
            System.out.print("Insira o " + (i + 1) + "º valor: ");
            int value = sc.nextInt();
            ps.addValue(value);
        }
        ps.print();
        System.out.println("First: " + ps.first());
    }
}
