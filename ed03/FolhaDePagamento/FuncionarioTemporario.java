package FolhaDePagamento;  

public class FuncionarioTemporario extends Funcionario {  // subclasse Funcionario, extends = herança da classe pai

    private static final double DESCONTO_TEMPORARIO = 100.0;  // desconto fixo de R$100,00

    public FuncionarioTemporario(String nome, double salarioBase) {  // construtor chamando a superclasse
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {  // implementação do cálculo de salário (polimorfismo visto na auula)
        return salarioBase - DESCONTO_TEMPORARIO;
    }
}
