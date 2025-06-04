package SistemaDeLogin; 

public interface Autenticavel {  // interface que define a autenticação
    boolean autenticar(String senha);  // metodo obrigatório de autenticação (SENHA)
}
