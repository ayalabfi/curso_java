package Introducao;

public class FuncoesMatematicas {

    public static void main(String[] args) {

        double x, y, z, A, B, C;
        x = 3.0;
        y = 4.0;
        z = -5.0;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " é " + A);
        System.out.println("Raiz quadrada de " + y + " é " + B);
        System.out.println("Raiz quadrada de 25 é " + C);

        A = Math.pow (x, y);
        B = Math.pow (x, 2.0);
        C = Math.pow (5.0, 2.0);
        System.out.println(x + " elevado a " + y + " é igual a " + A);
        System.out.println(x + " elevado ao quadrado é igual a " + B);
        System.out.println("5 elevado ao quadrado é igual a " + C);

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("O valor absoluto de " + y + " é " + A);
        System.out.println("O valor absoluto de " + z + " é"+B);
    }
}