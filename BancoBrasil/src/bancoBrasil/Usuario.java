package bancoBrasil;

import java.util.Date;

public class Usuario {
    String nome, sobrenome, telefone;
    Date dataRegistro;

    String imprimirinfo() {
        return String.format("Nome: %s\n Sobrenome: %s\n Telefone: %s\n Data de Registro: %s",
        this.nome, this.sobrenome, this.telefone, this.dataRegistro);
    }
}
