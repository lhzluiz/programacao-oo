public class PessoaJuridica extends ContatoBase { // a palavra extends é a que define o uso da herança da classe pai

    private String cnpj; // Atributo da classe

    public PessoaJuridica(String nome, String email, String telefone, String cnpj) { // chama o construtor da classe pai
        super(nome, email, telefone);
        this.cnpj = cnpj;
    }

    public PessoaJuridica() {} // construtor padrão

    public String getCnpj() { // getter > retorna o valor do atributo CNPJ
        return cnpj;
    }

    public void setCnpj(String cnpj) { // setter > CNPJ definido
        this.cnpj = cnpj;
    }
}
