package GraficaOnline;  

public class DocumentoTexto implements Imprimivel {  // implementa a interface Imprimivel

    private String titulo;  // armazena o título do documento
    private String conteudo;  // armazena o conteúdo do documento

    public DocumentoTexto(String titulo, String conteudo) {  // construtor que recebe os valores
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {  // implementação da interface
        System.out.println(titulo.toUpperCase());  // printa o título em maiúsculas
        System.out.println(conteudo);  // printa o conteudo
        System.out.println();  // ficar bonitinho
    }
}
