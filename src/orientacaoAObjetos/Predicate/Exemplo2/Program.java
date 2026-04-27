package orientacaoAObjetos.Predicate.Exemplo2;

import orientacaoAObjetos.Predicate.Exemplo2.entities.Product;
import orientacaoAObjetos.Predicate.Exemplo2.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        // Esse exemplo utiliza um método estático dentro da entidade Product

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        // O nome da função Product::staticProductPredicate se chama Method Reference
        list.removeIf(Product::staticProductPredicate);

        for (Product p : list){
            System.out.println(p);
        }
    }
}
