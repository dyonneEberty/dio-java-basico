package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        System.out.println("Por favor digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.println("Por favor digite a agencia bancaria: ");
        agencia = scanner.next();

        System.out.println("Por favor digite o nome do cliente: ");
        nomeCliente = scanner.next();

        System.out.println("Por favor digite o saldo bancario: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "
                +agencia+ ", conta " +numero+ ", e seu saldo " +saldo+ " já está disponível para saque!");

    }
}