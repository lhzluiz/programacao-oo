class Personagem {
    protected String nome;
    protected int hp; //atributo e metodo são privados
    protected int ataqueBase;

    public Personagem(String nome, int hp, int ataqueBase) {
        this.nome = nome;
        this.hp = hp;
        this.ataqueBase = ataqueBase;
    }

    public void atacar(Personagem inimigo) { //metódo atacar
        inimigo.defender(ataqueBase);
    }

    public void defender(int dano) { //método defender
        hp -= dano;
        if (hp < 0) hp = 0;
    }

    public void usarHabilidadeEspecial() {}

    public void status() {
        System.out.println(nome + " - HP: " + hp);
    }
}
