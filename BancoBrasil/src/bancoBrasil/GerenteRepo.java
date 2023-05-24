package bancoBrasil;

import java.util.ArrayList;

public class GerenteRepo {

    public ArrayList<Gerente> gerente = new ArrayList<>();
    public ArrayList<Gerente> addGerente() {
        gerente.add(new Gerente("rodrigo", "rabelo", "", "rodrigo", "123"));
        gerente.add(new Gerente("matheus", "vinicius", "", "matheus", "321"));
        gerente.add(new Gerente("", "", "", "teste", "teste"));
        return gerente;
    }
}
