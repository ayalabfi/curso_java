package orientacaoAObjetos.TryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        // Guardando o caminho do arquivo em uma String
        String caminho = "c:\\temp\\in.txt";
        /*
         utilizando o try dessa forma, não é mais necessário inicializar o BufferedReader e o
         FileReader com valores nulos.
         */
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))){

            String linha = br.readLine();

            while (linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
