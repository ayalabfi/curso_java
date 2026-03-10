package orientacaoAObjetos.Set.Exemplo3;

import orientacaoAObjetos.Set.Exemplo3.entities.Product;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Set<Product> set = new HashSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        Product prod = new Product("Notebook", 1200.0);

        /* Como a entidade Product não contem hashCode e Equals, o contains compara por ponteiros,
        e devido aos valores possuírem valores de identificador diferentes, o contains retorna que é
        false, mesmo os valores atribuídos aos objetos sendo iguais, para contornar isso, basta incluir
        o hashCode e equals a entidade.
         */
        System.out.println(set.contains(prod));
    }
}
