package Logica;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

    public static void main(String[] args) {

        // |List<Integer> list | Apenas declarou a lista, ela ainda não pode ser utilizada,
        // é necessário utilizar uma classe que implementa a interface, nesse caso, ArrayList.
        List<String> list = new ArrayList<>();

        // Adicionando elementos a lista de forma sequencial
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        // adicionando um elemento na lista em uma posição especifica
        list.add(2, "Marco");

        // Exibe o tamanho da lista
        System.out.println(list.size());

        // Removendo elementos da lista por busca e por posição, respectivamente.
        list.remove("Anna");
        list.remove(1);

        list.add("Anna");
        list.add(1, "Alex");

        // Removendo elementos da lista por meio de predicato, no caso abaixo, todos que iniciem com a letra M
        list.removeIf(x -> x.charAt(0) == 'M');

        list.add(0, "Maria");
        list.add(2, "Marco");

        // Utilizando for each para percorrer a lista
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("_________________________________");

        // Identificando a posição de um elemento existente (retorna 3)
        System.out.println("Posição do Bob: " + list.indexOf("Bob"));

        // Identificando a posição de um elemento inexistente (retorna -1)
        System.out.println("Posição do Leandro: " + list.indexOf("Leandro"));

        System.out.println("_________________________________");

        // Cria uma nova lista usando como base de dados outra lista, filtrando condições por meio de lambda
        // no caso abaixo, criando uma lista apenas com aqueles que começam com a letra "A" na lista list.
        List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : resultado) {
            System.out.println(x);
        }

        System.out.println("_________________________________");

        // Comando para encontrar o primeiro elemento por precidato (Busca não retornando nulo).
        String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(nome);

        System.out.println("_________________________________");

        // Comando para encontrar o primeiro elemento por predicato (Busca retorna nulo).
        nome = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(nome);
    }
}
