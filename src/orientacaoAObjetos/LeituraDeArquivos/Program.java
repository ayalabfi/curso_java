package orientacaoAObjetos.LeituraDeArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        // cria um objeto do tipo File e lê um arquivo localizado no caminho informado.
        File file = new File("c:\\temp\\in.txt");
        // inicia o Scanner com o valor nulo.
        Scanner sc = null;
        try{
            // Cria um scanner para fazer a leitura do arquivo.
            sc = new Scanner(file);
            // hasNextLine() verifica se há uma nova linha para ser lida.
            while (sc.hasNextLine()){
                // o sc.nextLine() nesses casos traz o texto da linha.
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            /*
             Esse if é feito porque se o sc permanecer como nulo e tentar processar um fechamento,
             pode ocorrer um erro de NullPointerException, por isso é interessante criar um if para
             que o Scanner só seja fechado em casos onde for diferente de nulo.
             */

            if (sc != null) {
                sc.close();
            }
        }

    }
}
