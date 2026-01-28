package orientacaoAObjetos.FileEBufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        // Guardando o caminho do arquivo em uma String
        String caminho = "c:\\temp\\in.txt";
        // Criando um FileReader e um BufferedReader e atribuindo seu valor como nulo apenas para inicializa-lo.
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Estabelecendo uma sequência de leitura a partir do arquivo que estiver no caminho.
            fr = new FileReader(caminho);
            // Colocando o FileReader dentro do BufferedReader para uma leitura mais rápida.
            // também pode ser declarada como "br = new BufferedReader(new FileReader(caminho));"
            br = new BufferedReader(fr);

            // Vai ler a linha do arquivo, e se a linha não existir, retornará null.
            String linha = br.readLine();

            while (linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
