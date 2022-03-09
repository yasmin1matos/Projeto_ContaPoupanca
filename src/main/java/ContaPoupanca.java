public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);

    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta poupanca ===");
        System.out.println(String.format("Agencia: %d", super.agencia));
        System.out.println(String.format("Numero: %d", super.numero));
        System.out.println(String.format("Saldo: %s", super.saldo));
    }


    @Override
    protected Object cliente() {
        // TODO Auto-generated method stub
        return null;
    }
}