public class Main {
    public static void main(String[] args) {
        Cliente yasmin = new Cliente();
        yasmin.setNome("Yasmin Matos Silveira");

        Conta cc = new ContaCorrente1(yasmin);
        Conta poupanca = new ContaPoupanca(yasmin);

        cc.depositar(100);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
