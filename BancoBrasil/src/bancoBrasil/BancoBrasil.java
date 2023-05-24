package bancoBrasil;

import java.util.ArrayList;
import java.util.Scanner;

public class BancoBrasil {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        boolean testeLogin = false;
        ArrayList<Usuario> users = new ArrayList<Usuario>();
        ArrayList<Gerente> gerentes = new ArrayList<>();
        Cliente cliente = new Cliente();
        ContaBancaria conta = new ContaBancaria();
        GerenteRepo db_gerente = new GerenteRepo();
        gerentes = db_gerente.addGerente();

        do {
            System.out.println("BEM VINDO");
            System.out.printf("LOGIN: ");
            String login = scan.next();
            System.out.printf("PASSWORD: ");
            String senha = scan.next();

            for(Gerente g : gerentes) {
                if(g.getLogin().equals(login) && g.getPassword().equals(senha)) {
                    testeLogin = true;
                }
            }
            if (testeLogin == false) {
                System.out.println("LOGIN OU SENHA INCORRETOS");
            }
        } while (testeLogin == false);

        while (opcao != 3) {
            System.out.println("BANCO BRASIL");
            System.out.println("1- Cadastro Cliente");
            System.out.println("2- Cadastro Conta");
            System.out.println("3- Sair");
            System.out.println("ESCOLHA OPÇÃO");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    cliente = new Cliente();
                    System.out.println("CADASTRO CLIENTE");
                    System.out.print("NOME: ");
                    cliente.setNome(scan.next());
                    System.out.print("SOBRENOME: ");
                    cliente.setSobrenome(scan.next());
                    System.out.print("TELEFONE: ");
                    cliente.setTelefone(scan.next());
                    users.add(cliente);
                    //users[i] = user;

                    break;
                case 2:
                    if (users.isEmpty()) {
                        System.out.println("Nenhum Usuario cadastrado");
                        break;
                    }
                    System.out.println("CADASTRO CONTA");
                    System.out.print("AGENCIA: ");
                    conta.setAgencia(scan.next());
                    System.out.print("CONTA: ");
                    conta.setConta(scan.next());
                    System.out.println("CLIENTES CADASTRADOS");

                    if(users.size() != 0) {
                        for (int i = 0; i < users.size(); i++) {
                            System.out.println((i + 1) + " - " + users.get(i).getNome() + " " + users.get(i).getSobrenome());
                        }
                        System.out.println("SELECIONE O CLIENTE");
                        int userOpcao = scan.nextInt();
                        if(userOpcao > users.size() || userOpcao < 0) {
                            System.out.println("CLIENTE N EXISTE");
                            break;
                        }
                        conta.setProprietario(users.get(userOpcao-1));
                    }

                    System.out.print("SALDO: ");
                    conta.setSaldo(scan.nextDouble());
                    break;
                case 3:
                    System.out.println("ATE LOGO");
                    //System.out.println("Cliente cadastrado: " + conta.getProprietario().getNome());
                    break;
                default:
                    System.out.println("INVALIDO SEU BURRO");
            }

        }
    }
}