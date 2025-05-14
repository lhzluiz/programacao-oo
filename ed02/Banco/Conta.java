class Conta {
    String cliente;
    double saldo;

    Conta(String cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    void depositar(double valor) { saldo += valor; }

    void sacar(double valor) { if (saldo >= valor) saldo -= valor; }

    void transferir(Conta destino, double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            destino.saldo += valor;
        }
    }

    void aplicarJurosDiarios() {}

    void imprimirExtrato() {
        System.out.println("Cliente: " + cliente + ", Saldo: R$" + saldo);
    }
}
