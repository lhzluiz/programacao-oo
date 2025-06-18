import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO { // lida com leitura e gravação em arquivo

    public void salvar(Contato contato) { // salva um unico contato
        List<String> dados = new ArrayList<>();
        dados.add(contato.toCSV());

        try {
            Files.write(Paths.get("contatos.txt"), dados, StandardOpenOption.APPEND); // escreve no fim do arquivo
        } catch (IOException e) {
            System.out.println("Erro ao salvar contato: " + e.getMessage()); // erro ao salvar
        }
    }

    public void salvar(List<Contato> contatos) { // salva todos os contatos
        List<String> linhas = new ArrayList<>();

        for (Contato c : contatos) {
            linhas.add(c.toCSV());
        }

        try {
            Files.write(Paths.get("contatos.txt"), linhas); // sobrescreve o arquivo
        } catch (IOException e) {
            System.out.println("Erro ao salvar lista de contatos: " + e.getMessage());
        }
    }

    public List<Contato> carregar() { // ainda não implementado
        return new ArrayList<>();
    }
}
