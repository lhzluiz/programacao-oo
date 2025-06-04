package GraficaOnline; 

public class GraficoEstatistico implements Imprimivel {  // implementa a interface Imprimivel

    private String titulo;  // titulo do gráfico
    private String tipoGrafico;  // tipo do gráfico 

    public GraficoEstatistico(String titulo, String tipoGrafico) {  // construtor que inicializa os atributos
        this.titulo = titulo;
        this.tipoGrafico = tipoGrafico;
    }

    @Override
    public void imprimir() {  // implementação da impressão personalizada
        System.out.println("Gráfico do tipo: " + tipoGrafico.toUpperCase());  // maiúsculo
        System.out.println("Título: " + titulo.toUpperCase());  // para colocar todas as letras em maiusculo
        System.out.println();  // bonitinho
    }
}
