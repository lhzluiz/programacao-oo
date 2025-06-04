package SistemaDeLogin; 

public class Visitante extends Usuario {  // Herda de Usuario (não estou implemetando interfac)

    public Visitante(String login, String senha) {  // construtor chamando a classe pai
        super(login, senha); //chama o construtor da classe pai
    }

    @Override
    public void exibirLogin() {  // Sobrescreve exibirLogin
        System.out.println("Visitante - acesso restrito ao sistema.");
    }
}
