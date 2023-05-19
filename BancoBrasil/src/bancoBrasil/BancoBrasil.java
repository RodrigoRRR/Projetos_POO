package bancoBrasil;


import java.util.Scanner;

public class BancoBrasil {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria();
        ContaBancaria contaBancaria2 = new ContaBancaria();

        Scanner scan = new Scanner(System.in);
        System.out.println("INFORME AGENCIA");
        contaBancaria1.setAgencia(scan.next());
        System.out.println("INFORME CONTA");
        contaBancaria1.setConta(scan.next());
        System.out.println("INFORME NOME");
        contaBancaria1.setProprietario(scan.next());
        System.out.println("INFORME DEPOSITO");
        contaBancaria1.depositar(scan.nextDouble());

        System.out.println("AGENCIA: " + contaBancaria1.getAgencia() + "\n"
        + "CONTA: " + contaBancaria1.getConta() + "\n"
        + "NOME: " + contaBancaria1.getProprietario() + "\n"
        + contaBancaria1.consultarSaldo());

        System.out.print("\nINFORME SAQUE: ");
        contaBancaria1.sacar(scan.nextDouble());

        System.out.println(contaBancaria1.consultarSaldo());
    }
}