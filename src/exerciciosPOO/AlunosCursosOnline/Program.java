package exerciciosPOO.AlunosCursosOnline;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("Quantos estudantes no curso A? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("Código do " + (i + 1) + "º aluno: " );
            int aluno = sc.nextInt();

            a.add(aluno);
        }
        System.out.print("Quantos estudantes no curso B? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("Código do " + (i + 1) + "º aluno: " );
            int aluno = sc.nextInt();

            b.add(aluno);
        }
        System.out.print("Quantos estudantes no curso C? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("Código do " + (i + 1) + "º aluno: " );
            int aluno = sc.nextInt();

            c.add(aluno);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total de alunos: " + total.size());

    }
}
