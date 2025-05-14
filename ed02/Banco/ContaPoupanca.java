class ContaPoupanca extends Conta {
    ContaPoupanca(String cliente, double saldo) { super(cliente, saldo); }

    void aplicarJurosDiarios() { saldo *= 1.0008; }

    void imprimirExtrato() {
        System.out.println("[Poupança] " + cliente + " - R$" + saldo);
    }
}
