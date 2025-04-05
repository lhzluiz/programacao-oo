  //criando a classe produto
    public class Produto {
     String nome;
    double preco;
    int quantidade;
    //criando o Construtor com apenas o nome
    public Produto (String nome){
        this(nome, 0.0,0);
    }

    //criando o construtor normal
    public Produto (String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Criando o Método
    public void exibir(){
        System.out.printf("Nome do produto: %s\n", nome);
        System.out.printf("Valor do produto: %.2f\n", preco);
        System.out.printf("Quantidade: %d\n", quantidade);
    }
}
