package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        System.out.println("Digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.println("Digite a agencia bancaria: ");
        agencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = scanner.next();

        System.out.println("Digite o saldo bancario: ");
        saldo = scanner.nextDouble();

        System.out.println("Numero: " +numero+ " - Agengia: " +agencia+ " - Nome do cliente: " +nomeCliente+ " - Saldo: " +saldo);

    }
}