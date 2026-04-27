package orientacaoAObjetos.Predicate.Exemplo1;

import orientacaoAObjetos.Predicate.Exemplo1.entities.Product;
import orientacaoAObjetos.Predicate.Exemplo1.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        // Esse exemplo utiliza um método próprio para a finalidade do predicato.

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        list.removeIf(new ProductPredicate());

        for (Product p : list){
            System.out.println(p);
        }
    }
}
