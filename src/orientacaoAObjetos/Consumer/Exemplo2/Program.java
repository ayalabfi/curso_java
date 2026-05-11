package orientacaoAObjetos.Consumer.Exemplo2;

import orientacaoAObjetos.Consumer.Exemplo2.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        // Fazer um programa que, a partir deu ma lista de produtos, aumente o preço dos produtos em 10%.
        // Exemplo com Reference method com método estático

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add (new Product("Mouse", 50.00));
        list.add (new Product("Tablet", 350.50));
        list.add (new Product("HD Case", 80.90));

        // o forEach recebe um Consumer como argumento
        list.forEach(Product::staticPriceUpdate);

        list.forEach(System.out::println);
    }
}
