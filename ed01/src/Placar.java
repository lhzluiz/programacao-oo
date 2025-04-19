import java.util.ArrayList;

public class Placar {
    private ArrayList<Jogador> jogadores;

    public Placar() {
        jogadores = new ArrayList<>();
    }

    public void registrarJogador(Jogador j) { // adiciona jogador ao ranking
        jogadores.add(j);
    }

    public void exibirPlacar() {
        System.out.println("\n-- PLACAR FINAL --");
        for (Jogador j : jogadores) {
            System.out.println(j.getNome() + " - " + j.getPontos() + " pontos");
        }
    }
}
