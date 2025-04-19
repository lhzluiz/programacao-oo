import java.util.Random;

public class Jogo {
    private Jogador jogador;
    private int numeroSorteado;

    public Jogo(Jogador jogador) { //inicializador do jogo
        this.jogador = jogador;
        this.numeroSorteado = new Random().nextInt(100) + 1;
    }

    public boolean tentativa(int chute) { //verificando se esta certo ou errado
        jogador.adicionarTentativa();

        if (chute < numeroSorteado) {
            System.out.println("O número secreto é maior.");
            return false;
        } else if (chute > numeroSorteado) {
            System.out.println("O número secreto é menor.");
            return false;
        } else {
            int pontuacaoFinal = Math.max(100 - jogador.getTentativas() * 10, 0);
            jogador.somarPontos(pontuacaoFinal);
            System.out.println("Parabéns! Você acertou!");
            return true;
        }
    }
}
