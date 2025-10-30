package introducao;

public class FuncoesString {

    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG     ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace ('a', 'x');
        String s07 = original.replace ("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("String padrão: ->" + original + "<-");
        System.out.println("Processo toLowerCase: ->" + s01 + "<-");
        System.out.println("Processo toUpperCase: ->" + s02 + "<-");
        System.out.println("Processo trim: ->" + s03 + "<-");
        System.out.println("Processo substring com 1 parâmetro: ->" + s04 + "<-");
        System.out.println("Processo substring com 2 parâmetros: ->" + s05 + "<-");
        System.out.println("Processo replace com char: ->" + s06 + "<-");
        System.out.println("Processo replace com String: ->" + s07 + "<-");
        System.out.println("Processo indexOf: ->" + i + "<-");
        System.out.println("Processo lastIndexOf: ->" + j + "<-");

        String s = "potato apple lemon";

        String [] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println("Na posição 1 do vetor foi gravado: ->" + word1 + "<-");
        System.out.println("Na posição 2 do vetor foi gravado: ->" + word2 + "<-");
        System.out.println("Na posição 3 do vetor foi gravado: ->" + word3 + "<-");
    }
}
