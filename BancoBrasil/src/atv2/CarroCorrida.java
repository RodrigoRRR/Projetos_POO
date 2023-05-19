package atv2;

public class CarroCorrida {
    private int numeroCarro;
    private String piloto, equipe;
    private float velocidadeMaxima, velocidadeAtual;
    private boolean ligado;

    public CarroCorrida() {

    }

    public CarroCorrida(int n, String p, String e, float vm, float va, boolean l) {
        this.numeroCarro = n;
        this.piloto = p;
        this.equipe = e;
        this.velocidadeMaxima = vm;
        this.velocidadeAtual = va;
        this.ligado = l;
    }

    public int getNumeroCarro() {
        return numeroCarro;
    }

    public void setNumeroCarro(int numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void acelerar(float a) {
        this.velocidadeAtual += a;
    }

    public float frear(float f) {
        float porcentagem = (f * 100) / this.velocidadeAtual;
        return porcentagem;
    }

    public void parar() {
        this.velocidadeAtual = 0;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }
}
