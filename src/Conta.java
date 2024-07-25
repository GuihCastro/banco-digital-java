import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {
    protected static final int AGENCIA_PADRAO = 1;
    private static final double LIMITE_PADRAO = 1000;
    protected static int SEQUENCIAL = 1;

    protected Cliente titular;
    protected int agencia;
    protected int conta;
    protected double saldo;
    protected double limite;

    protected List<Transacao> transacoes;

    public Conta(Cliente titular) {
        this.titular = titular;
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.limite = LIMITE_PADRAO;
        this.transacoes = new ArrayList<>();
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        if (this.saldo + this.limite >= valor) {
            this.saldo -= valor;
            this.transacoes.add(new Transacao("SAQUE", valor));
            System.out.println("Saque realizado com sucesso!");
        } else {
            this.transacoes.add(new Transacao("FALHA - Tentativa de Saque", valor));
            System.out.println("A transação falhou! Limite insuficiente.");        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        this.transacoes.add(new Transacao("DEPÓSITO", valor));
        System.out.println("Depósito realizado com sucesso!");
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (this.saldo + this.limite >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            this.transacoes.add(new Transacao("TRANSFERÊNCIA", valor));
            System.out.println("Transferência realizada com sucesso!");
        } else {
            this.transacoes.add(new Transacao("FALHA - Tentativa de Transferência", valor));
            System.out.println("A transação falhou! Limite insuficiente.");
        }
    }

    protected void imprimirInformacoes() {
        System.out.printf("Titular: %s%n", this.titular.getNome());
        System.out.printf("Agência: %d%n", this.agencia);
        System.out.printf("Conta: %d%n", this.conta);
        System.out.printf("Saldo: %.2f%n", this.saldo);
        System.out.printf("Limite disponível: %.2f", this.limite);
    }

    protected void imprimirExtratoDetalhado() {
        this.transacoes.forEach(System.out::println);
    }
}
