package SistemaDeLogin; 

public class Administrador extends Usuario implements Autenticavel, Gerenciavel, Logavel {  // herda de Usuario e implementa 3 interfaces

    public Administrador(String login, String senha) {  // construtor chamando a superclasse pai
        super(login, senha); //chama o construtor default da classe pai
    }

    @Override
    public boolean autenticar(String senha) {  // verifica se a senha bate com o sistema
        return this.senha.equals(senha);
    }

    @Override
    public void alterarSenha(String novaSenha) {  // altera a senha atual
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso.");
    }

    @Override
    public void bloquearUsuario() {  // bloqueia o usuario
        System.out.println("Usuário bloqueado com sucesso.");
    }

    @Override
    public void registrarLog(String operacao) {  // registra o log da operação
        System.out.println("Log registrado: " + operacao);
    }
}
