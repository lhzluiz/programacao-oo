package FolhaDePagamento;  

public class ProgramaFolha {  // classe pai que executa o programa

    public static void main(String[] args) {

        Funcionario funcionarioCLT = new FuncionarioCLT("Carlos", 2000.0);  // cria funcionário CLT
        Funcionario funcionarioTemporario = new FuncionarioTemporario("Ana", 2000.0);  // cria funcionário Temporario

        funcionarioCLT.exibirDados();  // exibe dados do CLT
        System.out.println("Salário Final: " + funcionarioCLT.calcularSalario());

        System.out.println();  // espaço

        funcionarioTemporario.exibirDados();  // exibe dados do Temporario
        System.out.println("Salário Final: " + funcionarioTemporario.calcularSalario());
    }
}
// fim
