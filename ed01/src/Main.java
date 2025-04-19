import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // scanf do C, para ler oq o jogador vai digitar
        Placar placar = new Placar();
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            System.out.print("\nDigite seu nome: ");
            String nome = entrada.nextLine(); // nome do jogador
            Jogador jogador = new Jogador(nome);
            Jogo jogo = new Jogo(jogador); // iniciar o jogo

            boolean acertou = false;

            while (!acertou) {
                System.out.print("Tente adivinhar o número (1 a 100): ");
                int palpite = entrada.nextInt(); // numero que o jogador escolheu
                acertou = jogo.tentativa(palpite); // verifica
            }

            System.out.println("Tentativas: " + jogador.getTentativas()); // tentativas
            System.out.println("Pontuação: " + jogador.getPontos()); // pontos

            placar.registrarJogador(jogador); // adiciona o jogador ao ranking
            placar.exibirPlacar(); // exibi o ranking

            entrada.nextLine(); // limpa buffer
            System.out.print("\nDeseja jogar novamente? (S/N): "); // quer jogar novamente?
            String resposta = entrada.nextLine();

            if (!resposta.equalsIgnoreCase("S")) {
                jogarNovamente = false;
            }
        }

        entrada.close(); // fecha
    }
}
