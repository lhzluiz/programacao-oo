public abstract class ContatoBase implements Contato { // atributos comuns

    private String nome; 
    private String email; //private = visivel aqui, escondido nos outros
    private String telefone;

    public ContatoBase(String nome, String email, String telefone) { // inicializa os atributos
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public ContatoBase() { this("", "", ""); } // construtor padrão

    public String getNome() { return nome; } // getter > retorna o nome
    public void setNome(String nome) { this.nome = nome; } // setter > define o nome

    public String getEmail() { return email; } // getter > retorna o email
    public void setEmail(String email) { this.email = email; } // setter > define o email

    public String getTelefone() { return telefone; } // getter > retorna o telefone
    public void setTelefone(String telefone) { this.telefone = telefone; } // setter > define o telefone

    public String toCSV() { return nome + "," + telefone + "," + email; } // retorna dados formatados no CSV
}
