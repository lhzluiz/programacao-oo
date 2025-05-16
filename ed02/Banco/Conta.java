class Conta { //Classe pai
    String cliente; //Atributo cliente
    double saldo; //atributo saldo

    Conta(String cliente, double saldo) { //Construtor
        this.cliente = cliente;
        this.saldo = saldo;
    }

    void depositar(double valor) { saldo += valor; } 

    void sacar(double valor) { if (saldo >= valor) saldo -= valor; } //se o saldo for maior ou igual ao valor soliticado, realizado a operação.

    void transferir(Conta destino, double valor) {
        if (saldo >= valor) {    
            saldo -= valor;
            destino.saldo += valor;                                    //METODOS
        }
    }

    void aplicarJurosDiarios() {} // não há nada definido "dentro", pois será usado posteriormente nas subclasses

    void imprimirExtrato() {
        System.out.println("Cliente: " + cliente + ", Saldo: R$" + saldo);
    }
}
