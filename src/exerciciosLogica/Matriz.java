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
                System.out.printf("Digite o valor na %d° coluna da %d° linha: ", j, i);
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite o número a ser consultado: ");
        int x = sc.nextInt();

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++) {
                if (x == mat[i][j]){
                    System.out.println("Posição: " + i + ", " + j);
                    if(j > 0){
                        System.out.println("Esquerda: " + mat[i][j - 1]);
                    }
                    if(j < mat[i].length - 1){
                        System.out.println("Direita: " + mat[i][j + 1]);
                    }
                    if(i > 0){
                        System.out.println("Acima: " + mat[i - 1][j]);
                    }
                    if(i < mat.length - 1){
                        System.out.println("Abaixo: " + mat[i + 1][j]);
                    }
                    System.out.println();
                }
            }
        }

        sc.close();
    }
}
