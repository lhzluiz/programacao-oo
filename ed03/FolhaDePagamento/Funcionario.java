package FolhaDePagamento;  // Exercicio 1

public abstract class Funcionario {  // classe principal do exercicio

    protected String nome;  // nome do funcionario
    protected double salarioBase;  // salario base

    public Funcionario(String nome, double salarioBase) {  // construtor para inicializar atributos
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void exibirDados() {  // exibe os dados basicos do funcionario
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: " + salarioBase);
    }

    public abstract double calcularSalario();  // mtodo abstrato (sera implementado pelas subclasses)
}
