package orientacaoAObjetos.Function.Exemplo3;

import orientacaoAObjetos.Function.Exemplo3.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        /* Fazer um programa que, a partir de uma lista de produtos, gere uma nova lista contendo os
        nomes dos produtos em caixa alta.
         */

        // Reference method com método não estático.

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        List<String> names = list.stream().map(Product::nonstaticUpperCaseName).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
