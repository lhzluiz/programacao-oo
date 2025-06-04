package GraficaOnline;  // main

public class ProgramaImpressao {  // classe com o método main

    public static void main(String[] args) {

        DocumentoTexto doc = new DocumentoTexto("Documento de Apresentação", "Este é o conteúdo do documento.");  // cria objeto DocumentoTexto
        ImagemDigital img = new ImagemDigital("paisagem.jpg", "1920x1080");  // ria objeto ImagemDigital
        GraficoEstatistico grafico = new GraficoEstatistico("Distribuição de Vendas", "barra");  // cria objeto GraficoEstatistico
        RelatorioPDF relatorio = new RelatorioPDF("João Silva", 12);  // cria objeto RelatorioPDF

        doc.imprimir();  // puxando imprimir do DocumentoTexto
        img.imprimir();  // puxando imprimir do ImagemDigital
        grafico.imprimir();  // puxando imprimir do GraficoEstatistico
        relatorio.imprimir();  //puxando imprimir do RelatorioPDF
    }
}
