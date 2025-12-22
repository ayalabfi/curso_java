package exerciciosLogica;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de linhas: ");
        int m = sc.nextInt();

        System.out.print("Insira a quantidade de colunas: ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++){
                System.out.printf("Digite o valor na coluna %d° da linha %d°", j, i);
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite o número a ser consultado: ");
        int x = sc.nextInt();

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++) {
                if (x == mat[i][j]){
                    int esquerda = mat[i][j-1];
                    System.out.println("Posição: " + i + ", " + j);
                    if(){

                    }
                    if{

                    }
                    if{

                    }
                    if{

                    }
                }
            }
        }

        sc.close();
    }
}
