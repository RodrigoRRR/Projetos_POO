package bancoBrasil;

public class ContaBancaria {
    private String agencia, conta, proprietario;
    double saldo;

    public ContaBancaria() {

    }

    public ContaBancaria(String a, String c, String p, double s) {
        this.agencia = a;
        this.conta = c;
        this.proprietario = p;
        this.saldo = s;
    }
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

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
