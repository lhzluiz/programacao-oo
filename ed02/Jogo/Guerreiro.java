class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 150, 25); 
    }

    @Override //sobreescrita de método
    public void defender(int dano) {
        super.defender(dano / 2); //reduz dano pela metade
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Golpe Duplo!");
        ataqueBase *= 2; //dobra o ataque base temporariamente
    }
}
