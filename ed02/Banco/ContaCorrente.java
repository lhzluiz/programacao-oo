class ContaCorrente extends Conta {
    ContaCorrente(String cliente, double saldo) { super(cliente, saldo); }

    void aplicarJurosDiarios() { saldo *= 1.001; }

    void imprimirExtrato() {
        System.out.println("[Corrente] " + cliente + " - R$" + saldo);
    }
}
