class ContaCorrente extends Conta { //subclasse que representa uma conta corrente
    ContaCorrente(String cliente, double saldo) { super(cliente, saldo); } //chama o construtor da classe pai

    void aplicarJurosDiarios() { saldo *= 0.001; } //aplicando os juros diarios

    void imprimirExtrato() { //imprime o extrato
        System.out.println("[Corrente] " + cliente + " - R$" + saldo);
    }
}
