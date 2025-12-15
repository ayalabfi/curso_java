package exerciciosPOO;

import exerciciosPOO.entidades.Pensionato;

import java.util.Scanner;

public class ExercicioPensionato {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de residentes a serem cadastrados: ");
        int n = sc.nextInt();

        Pensionato[] moradores = new Pensionato[10];

        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.printf("Insira o nome do %dº morador: ", i + 1);
            String nome = sc.nextLine();
            System.out.printf("Insira o e-mail do %dº morador: ", i + 1);
            String email = sc.nextLine();
            System.out.printf("Insira o quarto desejado: ");
            int quarto = sc.nextInt();
            if(moradores[quarto] != null){
                System.out.println("Este quarto já está ocupado, realize o cadastro novamente escolhendo\n" +
                        "outro quarto.");
                i--;
            } else {
                moradores[quarto] = new Pensionato(nome, email);
            }
        }

        System.out.println("\nQuartos ocupados:");

        for (int i = 0; i < moradores.length; i++){
            if (moradores[i] != null) {
                System.out.println(i + ": " + moradores[i]);
            }
        }
    }
}
