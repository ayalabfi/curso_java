package orientacaoAObjetos.Predicate.Exemplo3.util;

import orientacaoAObjetos.Predicate.Exemplo3.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product p) {
        return p.getValor() >= 100.0;
    }
}
