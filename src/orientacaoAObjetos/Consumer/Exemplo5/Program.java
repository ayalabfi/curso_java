package orientacaoAObjetos.Consumer.Exemplo5;

import orientacaoAObjetos.Consumer.Exemplo5.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {
        // Fazer um programa que, a partir deu ma lista de produtos, aumente o preço dos produtos em 10%.

        // Exemplo com expressão lambda inline.
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add (new Product("Mouse", 50.00));
        list.add (new Product("Tablet", 350.50));
        list.add (new Product("HD Case", 80.90));

        double factor = 1.1;


        // o forEach recebe um Consumer como argumento
        list.forEach(p -> p.setPrice(p.getPrice() * factor));

        list.forEach(System.out::println);
    }
}
