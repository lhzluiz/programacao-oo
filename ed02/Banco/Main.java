public class Main { //teste do sistema
    public static void main(String[] args) {
        Conta cc = new ContaCorrente("Alice", 1000); 
        Conta cp = new ContaPoupanca("Bob", 1500); //cc,cp e cs nome dado para acessar a conta corrente, etc..
        Conta cs = new ContaSalario("Carlos", 1200);

        cc.depositar(200); //alice deposita 200
        cp.sacar(100); //bob saca 100
        cs.transferir(cc, 300); //carlos transfere 300 para alice

        cc.aplicarJurosDiarios(); 
        cp.aplicarJurosDiarios(); //aplicando juros
        cs.aplicarJurosDiarios();

        cc.imprimirExtrato();
        cp.imprimirExtrato(); //exibindo extratos
        cs.imprimirExtrato();
    }
}
