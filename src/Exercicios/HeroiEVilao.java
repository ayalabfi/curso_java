package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class HeroiEVilao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Escolha a ação que seu herói tomará!\n" +
                "1 - Atacar\n" +
                "2 - Defender\n" +
                "3 - Fugir");

        int acaoHeroi = scanner.nextInt();
        int acaoVilao = random.nextInt(3);

        if (acaoHeroi == 1 && acaoVilao == 0) {
            System.out.println("Os dois se ferem!");
        } else if (acaoHeroi == 1 && acaoVilao == 1) {
            System.out.println(" O vilão bloqueia seu ataque!");
        } else if (acaoHeroi == 1 && acaoVilao == 2) {
            System.out.println("Você acerta o vilão pelas costas!");
        } else if (acaoHeroi == 2 && acaoVilao == 0) {
            System.out.println("Você bloqueia o ataque do vilão!");
        } else if (acaoHeroi == 2 && acaoVilao == 1) {
            System.out.println("Ambos ficam em posição defensiva...\nNinguém se fere.");
        } else if (acaoHeroi == 2 && acaoVilao == 2) {
            System.out.println("O vilão foge enquanto você se protege.");
        } else if (acaoHeroi == 3 && acaoVilao == 0) {
            System.out.println("Você escapa por pouco do ataque!");
        } else if (acaoHeroi == 3 && acaoVilao == 1) {
            System.out.println("Você foge com sucesso, o vilão nem tenta seguir.");
        } else if (acaoHeroi == 3 && acaoVilao == 2) {
            System.out.println("Ambos fogem...\nNinguém vence.");
        } else {
            System.out.println("Nesse RPG não existe este comando!");
        }
    }
}
