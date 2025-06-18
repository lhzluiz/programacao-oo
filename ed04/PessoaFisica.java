public class PessoaFisica extends ContatoBase { // representa Pessoa Física com CPF

    private String cpf; // cpf

    public PessoaFisica(String nome, String email, String telefone, String cpf) { // construtor com dados
        super(nome, email, telefone);
        this.cpf = cpf;
    }

    public PessoaFisica(String cpf) { this.cpf = cpf; } // construtor só com CPF

    public String getCpf() { return cpf; } // getter > retorna o CPF
    public void setCpf(String cpf) { this.cpf = cpf; } // setter > define o CPF
}
