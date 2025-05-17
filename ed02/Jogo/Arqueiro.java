class Arqueiro extends Personagem { // Ataque medio, habilidade de multipls ataques
    public Arqueiro(String nome) {
        super(nome, 120, 20);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " dispara Chuva de Flechas!");
    }
}
