package Logica;

public class ForEach {

    public static void main(String[] args) {

        String[] vect = new String[] {"Maria", "Bob", "Alex"};

/*         Utilizando laço for comum para percorrer todo o vetor
            for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
*/

        // Utilizando for each para percorrer todo o vetor
        for (String obj : vect) {
            System.out.println(obj);
        }
    }
}
