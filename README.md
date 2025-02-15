# Emulando um Banco Digital em Java

Este projeto é uma simulação de uma estrutura básica de um banco digital, desenvolvido com o intuito de estudar e aplicar os fundamentos da Programação Orientada a Objetos (POO) em Java.

## Descrição

O objetivo deste projeto é consolidar o conhecimento sobre POO, através da criação de um banco digital simples. As principais funcionalidades implementadas incluem a criação de contas, realização de transações (depósitos, saques e transferências) e impressão de extratos.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

- **Banco**: Responsável por gerenciar os clientes e suas contas.
- **Cliente**: Representa um cliente do banco, contendo informações pessoais.
- **Conta** (implementa a interface `IConta`): Classe base para as contas, contendo os métodos básicos de operação bancária.
- **IConta** (interface): Responsável por estabelecer alguns métodos obrigatórios que a Classe `Conta` deverá implementar.
- **ContaCorrente**: Subclasse de `Conta`, representando uma conta corrente.
- **ContaPoupanca**: Subclasse de `Conta`, representando uma conta poupança.
- **Transacao**: Classe responsável por registrar as transações realizadas (depósitos, saques e transferências).

## Funcionalidades Implementadas

- **Criar Conta**: Permite a criação de contas correntes e poupança para os clientes.
- **Sacar**: Realiza saque de um valor especificado da conta.
- **Depositar**: Realiza depósito de um valor especificado na conta.
- **Transferir**: Transfere um valor especificado de uma conta para outra.
- **Imprimir Extrato**: Imprime um extrato das transações realizadas em uma conta.
- **Registrar Transações**: Armazena o histórico de transações com data e hora.
- **Imprimir Extrato Detalhado**: Exibe o registro de transações.
- **Limite de Conta**: Aplica um limite de "Cheque Especial" para a conta.

## Exemplo de Uso

```java
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente joao = new Cliente("João");
        Cliente maria = new Cliente("Maria");

        Conta contaCorrente = new ContaCorrente(joao);
        Conta contaPoupanca = new ContaPoupanca(maria);

        contaCorrente.depositar(1000);
        contaCorrente.transferir(300, contaPoupanca);
        contaPoupanca.sacar(100);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
```

## Features Futuras

- **Empréstimos**: Implementar a funcionalidade de empréstimos para os clientes.
- **Pagamentos**: Permitir pagamento de contas diretamente da conta.
- **Investimentos**: Adicionar opções de investimento, como aplicações em fundos.
- **Interface Gráfica**: Desenvolver uma interface gráfica para facilitar o uso do banco digital.

## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, abra uma issue ou envie um pull request.
