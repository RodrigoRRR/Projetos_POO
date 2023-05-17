package bancoBrasil;

public class ContaBancaria {
    String agencia, conta, proprietario;
    double saldo;

    void depositar(double valor) {
        this.saldo += valor;
    }

    void sacar(double valor) {
        if(valor > saldo) {
            System.out.print("Saldo indisponivel \n");
        } else {
            this.saldo -= valor;
        }

    }

    void transferir() {

    }

    String consultarSaldo() {
        return String.format("Seu saldo é: R$ %.2f", this.saldo);
    }
}
