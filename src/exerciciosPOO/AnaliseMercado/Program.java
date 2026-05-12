package exerciciosPOO.AnaliseMercado;

import exerciciosPOO.AnaliseMercado.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o caminho do arquivo: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Product (fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            // Faz a somatória da média de valor dos produtos da lista
            double avg = list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x, y) -> x + y) / list.size();

            System.out.println("Preço médio: " + String.format("%.2f", avg));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            // Cria uma lista com os produtos que estão abaixo da média
            List<String> names = list.stream()
                    // Filtra apenas os produtos com valor abaixo da média
                    .filter(p -> p.getPrice() < avg)
                    // Identifica que será tratado nessa lista a função getName
                    .map(p -> p.getName())
                    // Ordena por ordem nominal inversa
                    .sorted(comp.reversed())
                    // Cria uma lista com os dados filtrados e ordenados
                    .collect(Collectors.toList());

            // Apresenta os nomes criados pela lista anterior um a um
            names.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
