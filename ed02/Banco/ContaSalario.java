class ContaSalario extends Conta { //subclasse
    ContaSalario(String cliente, double saldo) { super(cliente, saldo); }

    void imprimirExtrato() {
        System.out.println("[Salário] " + cliente + " - R$" + saldo); //não recebe juros
    }
}
