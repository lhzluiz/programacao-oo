package GraficaOnline;  

public class ImagemDigital implements Imprimivel {  // implementa a interface Imprimivel

    private String nomeArquivo;  // nome do arquivo da imagem
    private String resolucao;  // resolução da imagem (ex: 1920x1080)

    public ImagemDigital(String nomeArquivo, String resolucao) {  // construtor da classe
        this.nomeArquivo = nomeArquivo;
        this.resolucao = resolucao;
    }

    @Override
    public void imprimir() {  // implementação do método de impressão
        System.out.println("Arquivo: " + nomeArquivo);  // Exibe o nome do arquivo
        System.out.println("Resolução: " + resolucao);  // Exibe a resolução
        System.out.println();  // bonitinho, linha em branco
    }
}
