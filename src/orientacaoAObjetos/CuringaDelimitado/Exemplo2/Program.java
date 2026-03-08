package orientacaoAObjetos.CuringaDelimitado.Exemplo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(5);
        intList.add(10);

        List<? extends Number> list = intList;

        Number x = list.get(0);

        // Devido ao problema de covariância, não é possível inserir valores diretamente em uma lista do tipo coringa,
        // para isso é necessário utilizar a contravariância, que substitui extends por super.
        // list.add(20);

        List<Object> myObjs = new ArrayList<>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        List<? super Number> myNums = myObjs;
        myNums.add(10);
        myNums.add(3.14);

        // Já aqui, ocorre o problema de contravariância, não é possível acessar os elementos da lista e guardar em outra variável.
        // Number x = myNums.get(0);
    }
}
