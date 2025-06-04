package SistemaDeLogin; 

public class Cliente extends Usuario implements Autenticavel {  // herda de Usuario e implementa Autenticavel

    public Cliente(String login, String senha) {  // construtor chamando a superclasse pai
        super(login, senha);
    }

    @Override
    public boolean autenticar(String senha) {  // autenticação com regra adicional de tamanho
        return this.senha.equals(senha) && senha.length() > 6;
    }
}
