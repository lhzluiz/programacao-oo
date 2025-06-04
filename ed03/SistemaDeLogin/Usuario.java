package SistemaDeLogin; 

public abstract class Usuario {  // classe abstrata base

    protected String login;  // login do usuaario (visível nas subclasses)
    protected String senha;  // senha do usuario (visível nas subclasses)

    public Usuario(String login, String senha) {  // construtor que inicializa login e senha
        this.login = login;
        this.senha = senha;
    }

    public void exibirLogin() {  // exibe o login do usuario
        System.out.println("Login: " + login);
    }
}
