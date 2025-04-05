    //criando a classe Livro
    public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    //criando o Construtor genéricos
    public Livro (){
        this.titulo = "Titulo não definido";
        this.autor = "autor desconhecido";
        this.anoPublicacao = 0;
    }

    //criando o construtor normal
    public Livro (String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    //Criando o Método
    public void exibir(){
        System.out.printf("titulo do Livro: %s\n", titulo);
        System.out.printf("Nome do autor: %s\n", autor);
        System.out.printf("Ano de Publicação: %d\n", anoPublicacao);
    }
}
