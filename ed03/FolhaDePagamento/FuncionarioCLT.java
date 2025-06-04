package FolhaDePagamento; 

public class FuncionarioCLT extends Funcionario {  // subclasse de Funcionario

    private static final double ADICIONAL_CLT = 300.0;  // constante: adicional fixo de R$300,00

    public FuncionarioCLT(String nome, double salarioBase) {  // construtor que chama o da superclasse
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {  // implementação do cálculo de salário (polimorfismo visto na aula)
        return salarioBase + ADICIONAL_CLT;
    }
}
