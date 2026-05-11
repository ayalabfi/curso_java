package orientacaoAObjetos.Function.Exemplo1.util;

import orientacaoAObjetos.Function.Exemplo1.entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {
    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
