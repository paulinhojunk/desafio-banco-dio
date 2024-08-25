//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.setNome("Paulo");
        Conta cc = new ContaCorrente(paulo);
        cc.depositar(100);
        Conta poupanca = new ContaPoupanca(paulo);
        cc.transferir(100, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
}