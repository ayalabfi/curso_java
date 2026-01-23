package orientacaoAObjetos.MetodoAbstrato;

import orientacaoAObjetos.MetodoAbstrato.entidades.Circulo;
import orientacaoAObjetos.MetodoAbstrato.entidades.Forma;
import orientacaoAObjetos.MetodoAbstrato.entidades.Retangulo;
import orientacaoAObjetos.MetodoAbstrato.entidades.enums.Cor;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Forma> formas = new ArrayList<>();

        System.out.print("Insira quantas formas geométricas serão inseridas: ");
        int quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++){
            System.out.println("Insira os dados da " + i +"º forma geométrica:");
            System.out.print("Circulo ou retângulo (c/r)? ");
            char formato = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Cor (PRETO, AZUL, VERMELHO): ");
            Cor cor = Cor.valueOf(sc.nextLine());
            if(formato == 'c'){
                System.out.print("Insira o valor do raio: ");
                double raio = sc.nextDouble();
                Forma forma = new Circulo(cor, raio);
                formas.add(forma);
                System.out.println();
            } else if( formato == 'r'){
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                System.out.print("Largura: ");
                double largura = sc.nextDouble();
                Forma forma = new Retangulo(cor, altura, largura);
                formas.add(forma);
                System.out.println();
            } else {
                System.out.println("Forma geométrica informada não detectada.");
                System.out.println();
            }
        }

        System.out.println("Area das formas:");
        for (Forma f : formas){
            System.out.printf("%.2f%n",f.area());
        }

    }
}
