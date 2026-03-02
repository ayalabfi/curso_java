package orientacaoAObjetos.DefaultMethod;

import orientacaoAObjetos.DefaultMethod.model.services.*;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor: ");
        double amount = sc.nextDouble();
        System.out.print("Meses: ");
        int months = sc.nextInt();

        InterestService is = new USAInterestService(1);
        double payment = is.payment(amount, months);

        System.out.println("Pagamento após " + months + "months:");
        System.out.println(String.format("%.2f", payment));

        sc.close();


    }
}
