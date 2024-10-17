import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Guerreiro jogador = new Guerreiro("Jogador", 100, 20);
        ChefeFinal computador = new ChefeFinal("Chefe Final", 150, 25);

        System.out.println("Batalha entre Jogador e Chefe Final!");

        while (jogador.getVida() > 0 && computador.getVida() > 0) {
            System.out.println("\nSua vez de agir. Digite 'a' para atacar ou 'c' para curar:");
            String acao = scanner.next();

            if (acao.equals("a")) {
                jogador.atacar(computador);
            } else if (acao.equals("c")) {
                jogador.curar();
            } else {
                System.out.println("Ação inválida.");
            }

            if (computador.getVida() > 0) {
                if (random.nextBoolean()) {
                    computador.atacar(jogador);
                } else {
                    computador.curar();
                }
            }

            System.out.println("\nStatus:");
            System.out.println(jogador.getNome() + " - Vida: " + jogador.getVida());
            System.out.println(computador.getNome() + " - Vida: " + computador.getVida());
        }

        if (jogador.getVida() > 0) {
            System.out.println("\nParabéns! Você derrotou o Chefe Final.");
        } else {
            System.out.println("\nVocê foi derrotado pelo Chefe Final.");
        }

        scanner.close();
    }
}
