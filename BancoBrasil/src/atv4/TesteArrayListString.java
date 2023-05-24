package atv4;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayListString {
    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<String>();
        ArrayList<String> lista2 = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe uma string: ");
            lista1.add(scan.next());
            if (lista1.get(i).length() < 3) {
                lista2.add(lista1.get(i));
            }
        }
        lista1.removeAll(lista2);
        System.out.println("Tamanho da lista 1: " + lista1.size());
        System.out.println("Tamanho da lista 2: " + lista2.size());
    }
}
