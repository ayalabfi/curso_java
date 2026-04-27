package orientacaoAObjetos.Predicate.Exemplo4;

import orientacaoAObjetos.Predicate.Exemplo4.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Program {

    public static void main(String[] args) {

        // Esse exemplo utiliza um método de expressão lambda declarada

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        double min = 100.0;

        // Dessa forma você pode pegar valores de variáveis de forma mais simples.
        Predicate<Product> pred = p -> p.getValor() >= min;

        list.removeIf(pred);

        for (Product p : list){
            System.out.println(p);
        }
    }
}
