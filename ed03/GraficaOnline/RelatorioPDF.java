package GraficaOnline; 

public class RelatorioPDF implements Imprimivel {  // implementa a interface Imprimivel

    private String autor;  // nome do autor do relatório
    private int numeroPaginas;  // quantidade de páginas do relatório

    public RelatorioPDF(String autor, int numeroPaginas) {  // construtor que recebe os valores
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void imprimir() {  // implementação da interface
        System.out.println("Autor: " + autor);  // exibe o autor
        System.out.println("Total de páginas: " + numeroPaginas);  // exibe total de pginass
        System.out.println();  // bonitinho
    }
}
