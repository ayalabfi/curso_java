package exerciciosPOO.GeradorDeCSV;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo: ");
        String arquivo = sc.nextLine();
        Path caminhoArquivo = Paths.get(arquivo);
        String caminhoDiretorio = caminhoArquivo.getParent().toString();

        boolean gerouPasta = new File(caminhoDiretorio + "\\out").mkdir();

        if (gerouPasta) {
            System.out.println("A pasta out foi gerada com sucesso!");
        } else{
            System.out.println("A pasta out já existe!");
        }

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo));
        BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoDiretorio + "\\out\\summary.csv"))){

            bw.write("Produto,Custo Total");
            bw.newLine();
            String linha;

            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");

                String nomeProduto = dados[0];
                double valorTotal = Double.valueOf(dados[1]) *  Integer.valueOf(dados[2]);

                bw.write(nomeProduto + "," + String.format("%.2f",valorTotal));
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
