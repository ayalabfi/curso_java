package orientacaoAObjetos.Set.Exemplo1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {

        System.out.println("-- HashSet --\n");

        Set<String> hashSet = new HashSet<>();

        hashSet.add("TV");
        hashSet.add("Tablet");
        hashSet.add("Notebook");

        System.out.println(hashSet.contains("Notebook"));

        // Por meio da expressão funcional, foi definido que valores com tamanho maior que 3 seriam removidos.
        hashSet.removeIf(x -> x.length() >= 3);

        // devido a ser HashSet, não manteve a ordem, apresentando Notebook antes de Tablet.
        for (String p : hashSet) {
            System.out.println(p);
        }

        System.out.println("\n-- fim de HashSet --\n");

        System.out.println("-- TreeSet --\n");

        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Escova");
        treeSet.add("Shampoo");
        treeSet.add("Sabonete");

        System.out.println(treeSet.contains("Notebook"));


        // devido a ser TreeSet, manteve a ordem, apresentando os objetos na ordem que foram inseridos.
        for (String p : treeSet) {
            System.out.println(p);
        }

        System.out.println("\n-- Fim de TreeSet --\n");

        System.out.println("-- LinkedHashSet --\n");

        Set<String> linkedHasSet = new LinkedHashSet<>();

        linkedHasSet.add("Sapato");
        linkedHasSet.add("Calça");
        linkedHasSet.add("Camisa");

        System.out.println(linkedHasSet.contains("Camisa"));

        // Remove o objeto indicado.
        linkedHasSet.remove("Camisa");

        for (String p: linkedHasSet){
            System.out.println(p);
        }

        System.out.println("\n-- Fim de LinkedHashSet --\n");
    }
}
