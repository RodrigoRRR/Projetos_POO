package atv4;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayListNumero {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            System.out.print("Informe um numero: ");
            n.add(scan.nextInt());
        }

        if (n.contains(10) || n.contains(100) || n.contains(1000)) {
            System.out.println("VC GANHOU 50 REAIS");
        } else {
            System.out.println("N GANHOU NADA");
        }
    }
}
