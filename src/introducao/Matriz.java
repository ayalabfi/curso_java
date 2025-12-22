package introducao;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantas linhas e colunas a matriz terá: ");
        int n = sc.nextInt();

        // Colocar 2 [] cria uma matriz bi dimensional, nesse caso, a matriz possui n linhas e n colunas
        int [][] mat = new int[n][n];

        // Esse primeiro for percorrerá as linhas
        for (int i = 0; i < n; i++) {
            // Esse segundo for percorerá as colunas
            for (int j = 0; j < n; j++){
                System.out.printf("Insira o número localizado na %d° coluna  da %d° linha: ", j + 1, i + 1);
                mat [i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal: ");
        for (int i = 0; i < n; i++){
            System.out.print(mat[i][i] + " ");
        }

        int negativos = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (mat[i][j] < 0) {
                    negativos++;
                }
            }
        }

        System.out.printf("\nA matriz tem %d números negativos.", negativos);

        sc.close();
    }
}
