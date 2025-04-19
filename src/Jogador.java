public class Jogador {
    private String nome;
    private int tentativas;
    private int pontos;

    public Jogador(String nome) { // define o nome e inicia como 0 os pontos
        this.nome = nome;
        this.tentativas = 0;
        this.pontos = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getTentativas() {
        return tentativas;
    }

    public int getPontos() {
        return pontos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public void adicionarTentativa() { //incrementa
        tentativas++;
    }

    public void somarPontos(int valor) {
        pontos += valor; // soma a pontuação
    }
}
