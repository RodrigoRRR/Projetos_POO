package bancoBrasil;

public class Gerente extends Usuario{
    private String login, password;

    public Gerente() {

    }

    public Gerente(String n, String s, String t, String login, String password) {
        super(n, s, t);
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
