class ContaSalario extends Conta {
    ContaSalario(String cliente, double saldo) { super(cliente, saldo); }

    void imprimirExtrato() {
        System.out.println("[Salário] " + cliente + " - R$" + saldo);
    }
}
