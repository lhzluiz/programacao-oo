import java.util.List;
import java.util.Scanner;

public class ContatoView { // responsavel por "falar" com o usuário

    public void exibirMenu() { // exibe o menu principal para o usuario escolher
        System.out.println("=== Agenda de Contatos ===");
        System.out.println("1. Listar contatos");
        System.out.println("2. Adicionar Pessoa Física");
        System.out.println("3. Adicionar Pessoa Jurídica");
        System.out.println("4. Remover contato");
        System.out.println("5. Sair");
        System.out.print(">: ");
    }

    public int lerOpcao() { // ve o que foi digitado
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public Contato exibirAdicionarPessoaFisica() { // coleta dados para PF
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== Novo Contato PF ===");
        System.out.print("Nome........: ");
        String nome = teclado.nextLine();

        System.out.print("Email.......: ");
        String email = teclado.nextLine();

        System.out.print("Telefone....: ");
        String telefone = teclado.nextLine();

        System.out.print("CPF.........: ");
        String cpf = teclado.nextLine();

        return new PessoaFisica(nome, email, telefone, cpf);
    }

    public Contato exibirAdicionarPessoaJuridica() { // coleta dados para PJ
        Scanner teclado = new Scanner(System.in);
        PessoaJuridica contato = new PessoaJuridica();

        System.out.println("=== Novo Contato PJ ===");
        System.out.print("Nome........: ");
        contato.setNome(teclado.nextLine());

        System.out.print("Email.......: ");
        contato.setEmail(teclado.nextLine());

        System.out.print("Telefone....: ");
        contato.setTelefone(teclado.nextLine());

        System.out.print("CNPJ........: ");
        contato.setCnpj(teclado.nextLine());

        return contato;
    }

    public void exibirListarContatos(final List<Contato> contatos) { // exibe todos os contatos
        System.out.println("=== Contatos Cadastrados ===");
        for (Contato c : contatos) {
            System.out.printf("| %-10s | %-10s | %-10s |%n", c.getNome(), c.getEmail(), c.getTelefone());
        }
        System.out.println();
    }

    public String exibirRemoverContato() { // lê o CPF ou CNPJ para remoção
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== Remoção de Contato ===");
        System.out.print("Digite o CPF ou CNPJ do contato: ");
        return teclado.nextLine();
    }
}
