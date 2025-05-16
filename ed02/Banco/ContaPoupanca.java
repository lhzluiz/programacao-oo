class ContaPoupanca extends Conta {
    ContaPoupanca(String cliente, double saldo) { super(cliente, saldo); } // Chamando construtor default da classe pai

    void aplicarJurosDiarios() { saldo *= 0.0008; } //continha para aplicar os juros diarios

    void imprimirExtrato() { //imprime o extrato
        System.out.println("[Poupança] " + cliente + " - R$" + saldo);
    }
}
