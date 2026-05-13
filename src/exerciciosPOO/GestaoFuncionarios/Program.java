package exerciciosPOO.GestaoFuncionarios;

import exerciciosPOO.GestaoFuncionarios.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o caminho do arquivo de funcionários: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Employee> list = new ArrayList<>();

            String line = br.readLine();

            while (line != null) {

                String[] fields = line.split(",");

                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));

                line = br.readLine();
            }

            System.out.print("Insira o salário: ");
            Double salary = sc.nextDouble();

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            System.out.println("E-mail dos funcionários com salário maior que 2000.00:");
            List<String> emails = list.stream()
                    .filter(e -> e.getSalary() > 2000.00)
                    .map(e -> e.getEmail())
                    .sorted(comp)
                    .collect(Collectors.toList());

            emails.forEach(System.out::println);

            System.out.print("Insira a primeira letra a ser filtrada: ");
            char letter = sc.next().charAt(0);

            Double sum = list.stream()
                    .filter(p -> p.getName().charAt(0) == letter)
                    .map(p -> p.getSalary())
                    .reduce(0.0,(x,y) -> x + y);

            System.out.printf("Soma dos salários cujo operadores tem nomes que se iniciam com '" + letter + "': %.2f",sum);

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
