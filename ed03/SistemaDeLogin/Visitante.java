package SistemaDeLogin; 

public class Visitante extends Usuario {  // Herda de Usuario (não estou implemetando interfac)

    public Visitante(String login, String senha) {  // construtor chamando a superclasse
        super(login, senha);
    }

    @Override
    public void exibirLogin() {  // Sobrescreve exibirLogin
        System.out.println("Visitante - acesso restrito ao sistema.");
    }
}
