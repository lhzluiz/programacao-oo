public class Pessoa {
    private String nome;
    private int idade;
   // Construtor que vai inicializar
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
 
     // Método 
    public void exibir() {
        System.out.printf("Nome da Pessoa: %s\n", nome);
        System.out.printf("Idade: %d\n", idade);
    }
}

