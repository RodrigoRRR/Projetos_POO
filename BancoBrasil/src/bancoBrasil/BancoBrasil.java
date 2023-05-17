package bancoBrasil;


import java.util.Scanner;

public class BancoBrasil {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria();
        ContaBancaria contaBancaria2 = new ContaBancaria();

        contaBancaria1.agencia = "0001";
        contaBancaria1.conta = "12345";
        contaBancaria1.proprietario = "Rodrigo";
        contaBancaria1.saldo = 1.99;

        //System.out.println(contaBancaria1.agencia + " " + contaBancaria1.conta + " " + contaBancaria1.proprietario + " " + contaBancaria1.saldo);

        Scanner scan = new Scanner(System.in);
    }
}