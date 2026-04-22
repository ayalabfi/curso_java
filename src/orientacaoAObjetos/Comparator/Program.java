package orientacaoAObjetos.Comparator;

import orientacaoAObjetos.Comparator.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        /* uma das formas de comparar
        list.sort(new MyComparator());

         */

        /* É possível fazer a inicialização do comparator diretamente dentro do programa também,
        mas dessa forma é muito verboso, devido a isso, usaremos a expressão lambda
        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };



        list.sort(comp);

         */

        /* essa sintaxe -> é chamada de arrow function, e como o programa tem apenas 1 linha de execução,
        não é necessário as chaves, além de que, ele pode ser usado diretamente como argumento do list.sort

        Comparator<Product> comp = (p1, p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

         */
        list.sort((p1, p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : list){
            System.out.println(p);
        }
    }
}
