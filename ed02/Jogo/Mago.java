class Mago extends Personagem { // criando a subclasse Mago
                                // a palavra extends é a que define o uso da herança da classe pai (Personagem)
    public Mago(String nome) {
        super(nome, 100, 30); // Ataque alto, defesa fraca, lança bola de fogo
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " lança Bola de Fogo! (ataque em área)");
    }
}
