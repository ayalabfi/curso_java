package introducao;

import java.util.Locale;

public class SaidaDeDados {

    public static void main(String[] args){

        // Iniciando as variáveis.
        int y = 32;
        double x = 10.35784;
        String nome = "Ayala";
        int idade = 26;
        double renda = 2200.0;

        // Apresentando a variável y com quebra de linha.
        System.out.println (y);

        // Delimitando a variável x a apenas 2 casas decimais.
        System.out.printf ("%.2f%n", x);
        // Delimitando a variável x a apenas 4 casas decimais.
        System.out.printf ("%.4f%n", x);

        // Imprimindo um texto comum "Good morning!".
        System.out.println(" Good morning!");

        // Colocando as regras de linguagem de um determinado país (US).
        Locale.setDefault(Locale.US);

        // Concatenando com println.
        System.out.println("Resultado: "+ y + " Metros");

        // Concatenando com printf (%.2f busca a(s) variavel(is) declarada(s)
        // e %n faz a quebra de linha).
        System.out.printf ("Resultado: %.2f metros%n", x);

        // Outro exemplo de printf concatenado.
        System.out.printf("%s tem %d anos e recebe %.2f Reais.", nome, idade, renda);
    }
}
