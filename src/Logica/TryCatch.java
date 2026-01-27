package Logica;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        metodo1();

        System.out.println("Fim do programa");

        sc.close();
    }

    public static void metodo1(){
        System.out.println("-> Inicio do método 1 <-");
        metodo2();
        System.out.println("-> Fim do método 1 <-");
    }

    public static void metodo2(){

        System.out.println("-> Inicio do método 2 <-");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

                /* Try (tentar) → Ele tenta realizar o procedimento dentro do bloco,
         e caso dê algum erro, busca um catch correspondente com o erro.
         */
        try {
            String[] vetor = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vetor[position]);
    /*
    Catch (capturar) → Ele captura o erro e consulta se há algum catch que
    utiliza o mesmo tipo de erro, e a partir disso processa o bloco dentro
    do catch, trazendo, na maior parte das vezes, uma mensagem customizada ao
    usuário final.
     */
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição invalida!");
            // Apresenta toda a chamada de métodos que levou a exceção.
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("O caractere utilizado é invalido!");
        }

        sc.close();

        System.out.println("-> Fim do método 2 <-");
    }
}
