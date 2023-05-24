package bancoBrasil;

import java.util.Date;

public class Cliente extends Usuario{
    private Date dataRegistro = new Date();

    public Cliente() {
    }

    public Cliente(String n, String s, String t, Date dataRegistro) {
        super(n, s, t);
        this.dataRegistro = dataRegistro;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    @Override
    public String imprimirInfo() {
        return String.format("Nome: %s\n Sobrenome: %s\n Telefone: %s\n Data de Registro: %s\n Data de Registro: %s",
                super.getNome(), super.getSobrenome(), super.getTelefone(), this.dataRegistro);
    }
}
