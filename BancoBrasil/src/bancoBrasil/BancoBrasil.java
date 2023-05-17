package bancoBrasil;


import java.util.Scanner;

public class BancoBrasil {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria();
        ContaBancaria contaBancaria2 = new ContaBancaria();

        Scanner scan = new Scanner(System.in);
        System.out.println("INFORME AGENCIA");
        contaBancaria1.agencia = scan.next();
        System.out.println("INFORME CONTA");
        contaBancaria1.conta = scan.next();
        System.out.println("INFORME NOME");
        contaBancaria1.proprietario = scan.next();
        System.out.println("INFORME DEPOSITO");
        contaBancaria1.depositar(scan.nextDouble());

        System.out.println("AGENCIA: " + contaBancaria1.agencia + "\n"
        + "CONTA: " + contaBancaria1.conta + "\n"
        + "NOME: " + contaBancaria1.proprietario + "\n"
        + contaBancaria1.consultarSaldo());

        System.out.print("\nINFORME SAQUE: ");
        contaBancaria1.sacar(scan.nextDouble());

        System.out.println(contaBancaria1.consultarSaldo());
    }
}