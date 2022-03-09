public class ContaCorrente1 extends Conta {

    public ContaCorrente1(Cliente cliente) {
        super(cliente);

    }

    public void ContaCorrente(Cliente yasmin) {

    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta corrente ===");
        super.imprimirInfoscomuns();
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agencia: %d",super.agencia));
        System.out.println(String.format("Numero: %d",super.numero));
        System.out.println(String.format("Agencia: %d",super.saldo));
    }


    @Override
    protected Object cliente() {
        // TODO Auto-generated method stub
        return null;
    }

}
