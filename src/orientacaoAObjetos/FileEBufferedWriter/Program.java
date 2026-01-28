package orientacaoAObjetos.FileEBufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        String[] linhas = new String[] {"Bom dia!", "Boa tarde!", "Boa noite!"};
        String caminho = "C:\\temp\\out.txt";


        try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))){
            for (String linha : linhas) {
                // Escreve oque está na linha de acordo com o vetor.
                bw.write(linha);
                // Quebra a linha.
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
