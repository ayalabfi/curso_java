package orientacaoAObjetos.FunctionQueRecebeFunction;

import orientacaoAObjetos.FunctionQueRecebeFunction.entities.Product;
import orientacaoAObjetos.FunctionQueRecebeFunction.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {
        /* Fazer um programa que, a partir de uma lista de produtos, calcule o preço médio somente dos
        produtos cujo nome começa com "T".
         */
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'H');

        System.out.println("Soma = " + String.format("%.2f", sum));
    }
}
