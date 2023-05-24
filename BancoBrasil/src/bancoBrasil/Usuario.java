package bancoBrasil;

import java.util.Date;

public class Usuario {
    private String nome, sobrenome, telefone;


    public Usuario() {

    }

    public Usuario(String n, String s, String t) {
        this.nome = n;
        this.sobrenome = s;
        this.telefone = t;
    }
    public String imprimirInfo() {
        return String.format("Nome: %s\n Sobrenome: %s\n Telefone: %s\n Data de Registro: %s",
        this.nome, this.sobrenome, this.telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
