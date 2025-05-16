class Conta { //Classe pai
    String cliente; //Atributo cliente (nome)
    double saldo; //atributo saldo (saldo da conta)

    Conta(String cliente, double saldo) { //Construtor da classe conta
        this.cliente = cliente;
        this.saldo = saldo;
    }

    void depositar(double valor) { saldo += valor; } //depositar um valor na conta

    void sacar(double valor) { if (saldo >= valor) saldo -= valor; } //se o saldo for maior ou igual ao valor soliticado, 
    // realizado a operação.

    void transferir(Conta destino, double valor) { //método para transferir um valor de uma conta para outra
        if (saldo >= valor) {    
            saldo -= valor;
            destino.saldo += valor;                                    //METODOS
        }
    }

    void aplicarJurosDiarios() {} // não há nada definido "dentro", pois será usado posteriormente nas subclasses

    void imprimirExtrato() { //imprimir o extrato da conta
        System.out.println("Cliente: " + cliente + ", Saldo: R$" + saldo);
    }
}
