package SistemaDeLogin;  

public interface Gerenciavel {  // interface para gerenciar USUARIOS
    void alterarSenha(String novaSenha);  // Meodo para alterar a senha
    void bloquearUsuario();  // metodo para bloquear o usuario
}
