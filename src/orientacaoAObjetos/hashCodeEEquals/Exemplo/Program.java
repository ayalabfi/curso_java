package orientacaoAObjetos.hashCodeEEquals.Exemplo;

import orientacaoAObjetos.hashCodeEEquals.Exemplo.entities.Client;

public class Program {

    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@email.com");
        Client c2 = new Client("Alex", "alex@email.com");
        Client c3 = new Client("Maria", "maria@email.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c1 == c3);

        /* c1 == c3, com exceção de tipos, compara as referências de memória, como são objetos diferentes no
        reap, é retornado falso
         */

        String s1 = "Test";
        String s2 = "Test";

        // devido a ser uma expressão literal idêntica a outra, é retornado true
        System.out.println(s1 == s2);

    }
}
