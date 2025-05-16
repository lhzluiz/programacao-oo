class MainRpg { // teste do sistema
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Thorgal"); //Guerreiro vai receber Thorga1
        Mago m = new Mago("Merlino"); // Mago vai receber Merlino
        Arqueiro a = new Arqueiro("Legolis"); //Arqueiro vai receber Legolis

        g.status();
        m.status();
        a.status();

        g.atacar(m); //Guerreiro ataca o mago
        m.usarHabilidadeEspecial();
        a.usarHabilidadeEspecial();

        g.status();
        m.status();
        a.status();
    }
}
