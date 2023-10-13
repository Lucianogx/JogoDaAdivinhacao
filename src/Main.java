import classificacaoNivel.NivelJogador;
import sorteador.Sorteador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, qual o seu nome?");
        String nome = scanner.nextLine();
        System.out.println("E a sua idade?");
        int idade = scanner.nextInt();
        System.out.println("Olá, jogador " + nome + " bem vindo ao roleta-6.\n" +
                "Você terá 6 chances para acertar o imprevisível número da sorte e assim poder" +
                " contemplar sua sorte ao acertar o número.\n");
        NivelJogador jogador = new NivelJogador(nome, idade);
        System.out.println("Neste jogo você entrará no nível " + jogador.nivelDeDificuldade() +
                ". Você deverá acertar um número entre " + jogador.explicandoTenativas() + ".\n" +
                "Boa sorte, " + nome + ".\n" +
                "\nPor favor, digite o seu número");
        int entrada = scanner.nextInt();
        Sorteador sorteador = new Sorteador(entrada);

        int tentativas = 6;
        if (jogador.nivelDeDificuldade().equalsIgnoreCase("1")) {
            while (tentativas > 1) {
                int numeroSorteado = sorteador.numeroAleatorioNivel1();
                if (numeroSorteado == entrada) {
                    tentativas = 0;
                    System.out.println("Parabens! Nós acreditavamos em você! Está de parabéns!!");
                } else {
                    System.out.println("Ainda não. Você tem " + (tentativas - 1) + " tentativas.\n" +
                            " O numero sorteado foi " + numeroSorteado);
                    entrada = scanner.nextInt();
                }
                tentativas--;
            }
        } else if (jogador.nivelDeDificuldade().equalsIgnoreCase("2")) {
            while (tentativas > 1) {
                int numeroSorteado = sorteador.numeroAleatorioNivel2();
                if (numeroSorteado == entrada) {
                    tentativas = 0;
                    System.out.println("Parabens! Nós mal acreditamos que acertou, é um número difícil!");
                } else {
                    System.out.println("Ainda não. Você tem " + (tentativas - 1) + " tentativas.\n" +
                            "O numero sorteado foi " + numeroSorteado);
                    entrada = scanner.nextInt();
                }
                tentativas--;
            }
        }
        System.out.println("Não foi dessa vez :(. Pode tentar novamente quantas vezes quiser!!\n" +
                "Será sempre bem vindo!");
    }
}