class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 150, 25);
    }

    @Override
    public void defender(int dano) {
        super.defender(dano / 2);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Golpe Duplo!");
        ataqueBase *= 2;
    }
}
