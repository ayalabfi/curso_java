package orientacaoAObjetos.Predicate.Exemplo5.util;

import orientacaoAObjetos.Predicate.Exemplo5.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product p) {
        return p.getValor() >= 100.0;
    }
}
