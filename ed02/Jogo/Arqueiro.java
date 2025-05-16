class Arqueiro extends Personagem { // Ataque médio, habilidade de múltiplos ataques
    public Arqueiro(String nome) {
        super(nome, 120, 20);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " dispara Chuva de Flechas!");
    }
}
