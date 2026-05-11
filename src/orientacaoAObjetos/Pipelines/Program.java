package orientacaoAObjetos.Pipelines;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum = " + sum);

        List<Integer> newList = list.stream()
                // Filtra apenas os números pares
                .filter(x -> x % 2 == 0)
                // Multiplica os números por 10
                .map(x -> x * 10)
                // Insere os números em uma lista
                .collect(Collectors.toList());

        System.out.println(Arrays.toString(newList.toArray()));

    }
}
