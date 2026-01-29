package orientacaoAObjetos.ManipulandoPastas;

import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o caminho da pasta: ");
        String strCaminho = sc.nextLine();

        File caminho = new File(strCaminho);

        // Insere na Array pastas do tipo File apenas o que for diretório do caminho passado.
        File[] pastas = caminho.listFiles(File::isDirectory);
        System.out.println("Pastas:");
        for (File pasta : pastas) {
            System.out.println(pasta);
        }

        // Insere na Array arquivos do tipo File apenas o que for arquivo do caminho passado.
        File[] arquivos = caminho.listFiles(File::isFile);
        System.out.println("Arquivos:");
        for (File arquivo : arquivos){
            System.out.println();
            // Essa ação traz apenas o nome do arquivo.
            System.out.println("Nome do arquivo: " + arquivo.getName());
            // Essa ação traz apenas o caminho do arquivo.
            System.out.println("Caminho: " + arquivo.getParent());
            // Essa função traz o caminho e nome do arquivo, pode ser usado também arquivo.getPath()
            System.out.println("Caminho e nome: " + arquivo);
        }
        System.out.println();

        /*
         Utiliza boolean para retornar true ou false na tentativa de criar um diretório com o nome subdir
         no caminho passado, se a pasta não existir, cria a pasta e retorna true, se a pasta existir, não
         cria a pasta e retorna false.
         */
        boolean sucesso = new File(strCaminho + "\\subdir").mkdir();
        System.out.println("Diretório criado com sucesso: " + sucesso);


        sc.close();
    }
}
