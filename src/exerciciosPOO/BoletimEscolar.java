package exerciciosPOO;

import exerciciosPOO.entidades.Estudante;

import java.util.Scanner;

public class BoletimEscolar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Estudante estudante = new Estudante();

        System.out.print("Insira o nome do aluno: ");
        estudante.alunoNome = scanner.nextLine();
        System.out.print("Insira a primeira nota: ");
        estudante.nota1 = scanner.nextDouble();
        System.out.print("Insira a segunda nota: ");
        estudante.nota2 = scanner.nextDouble();
        System.out.print("Insira a terceira nota: ");
        estudante.nota3 = scanner.nextDouble();

        System.out.println(estudante);
    }
}
