class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, 100, 30);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " lança Bola de Fogo! (ataque em área)");
    }
}
