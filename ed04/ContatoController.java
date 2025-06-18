import java.util.ArrayList;
import java.util.List;

public class ContatoController { // manipula a lista de cnttos

    public void executar() { // metodo principal
        List<Contato> contatos = new ArrayList<>(); // para armazenar os contatos
        ContatoView view = new ContatoView(); // responsavel pela interface com o usuário

        boolean ativo = true; // controle de execução
        while (ativo) {
            view.exibirMenu(); // exibe o menu no console
            int opcao = view.lerOpcao(); // ver qual foi a opção escolhida

            switch (opcao) {
                case 1:
                    view.exibirListarContatos(contatos);
                    break;
                case 2:
                    Contato pf = view.exibirAdicionarPessoaFisica(); // Adiciona PF
                    contatos.add(pf);
                    break;
                case 3:
                    Contato pj = view.exibirAdicionarPessoaJuridica(); // Adiciona PJ
                    contatos.add(pj);
                    break;
                case 4:
                    String id = view.exibirRemoverContato(); // se quiser remover
                    boolean removido = false;

                    for (Contato c : contatos) {
                        if (c instanceof PessoaFisica && ((PessoaFisica) c).getCpf().equals(id)) { // verifica se o contato é PF e se o CPF corresponde ao informado
                            contatos.remove(c); // Remove PF
                            removido = true;
                            break;
                        } else if (c instanceof PessoaJuridica && ((PessoaJuridica) c).getCnpj().equals(id)) { // verifica se o contato é PJ e se o CNPJ corresponde ao informado
                            contatos.remove(c); // Remove PJ
                            removido = true;
                            break;
                        }
                    }

                    if (removido) {
                        System.out.println("Contato removido com sucesso!");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 5:
                    ativo = false; // para sair, encerra o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente."); //se apertar qualquer coisa diferente
            }
        }
    }
}
