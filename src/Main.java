public class Main {
    public static void main(String[] args) {
        Cliente guilherme = new Cliente("Guilherme");

        Conta contaCorrente = new ContaCorrente(guilherme);
        Conta contaPoupanca = new ContaPoupanca(guilherme);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        contaCorrente.depositar(500);
        contaCorrente.transferir(50, contaPoupanca);
        contaCorrente.sacar(100);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        contaCorrente.imprimirExtratoDetalhado();

        contaPoupanca.sacar(1010);
        contaCorrente.sacar(3000);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        contaCorrente.imprimirExtratoDetalhado();
        contaPoupanca.imprimirExtratoDetalhado();
    }
}
