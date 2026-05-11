package orientacaoAObjetos.Function.Exemplo1;

import orientacaoAObjetos.Function.Exemplo1.entities.Product;
import orientacaoAObjetos.Function.Exemplo1.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        /* Fazer um programa que, a partir de uma lista de produtos, gere uma nova lista contendo os
        nomes dos produtos em caixa alta.
         */

        // Implementação da interface

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
