package orientacaoAObjetos.Function.Exemplo4;

import orientacaoAObjetos.Function.Exemplo4.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        /* Fazer um programa que, a partir de uma lista de produtos, gere uma nova lista contendo os
        nomes dos produtos em caixa alta.
         */

        // Reference method com expressão lambda declarada.

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        Function<Product, String> func = p -> p.getName().toUpperCase();

        List<String> names = list.stream().map(func).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
