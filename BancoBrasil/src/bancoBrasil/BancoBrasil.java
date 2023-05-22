package bancoBrasil;


import java.util.ArrayList;
import java.util.Scanner;

public class BancoBrasil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*ContaBancaria contaBancaria1 = new ContaBancaria();
        ContaBancaria contaBancaria2 = new ContaBancaria();

        System.out.println("INFORME AGENCIA");
        contaBancaria1.setAgencia(scan.next());
        System.out.println("INFORME CONTA");
        contaBancaria1.setConta(scan.next());
        System.out.println("INFORME NOME");
        contaBancaria1.setProprietario(scan.next());
        System.out.println("INFORME DEPOSITO");
        contaBancaria1.depositar(scan.nextDouble());

        System.out.println("AGENCIA: " + contaBancaria1.getAgencia() + "\n"
        + "CONTA: " + contaBancaria1.getConta() + "\n"
        + "NOME: " + contaBancaria1.getProprietario() + "\n"
        + contaBancaria1.consultarSaldo());

        System.out.print("\nINFORME SAQUE: ");
        contaBancaria1.sacar(scan.nextDouble());

        System.out.println(contaBancaria1.consultarSaldo());*/
        int opcao = 0;
        boolean exist = false;
        ArrayList<Usuario> clientes = new ArrayList<Usuario>();
        Usuario user = new Usuario();
        ContaBancaria conta = new ContaBancaria();
        Usuario[] users = new Usuario[5];

        while (opcao != 3) {
            System.out.println("BANCO BRASIL");
            System.out.println("1 - Cadastro Cliente");
            System.out.println("2 - Cadastro Conta");
            System.out.println("3 - Sair");
            System.out.println("ESCOLHA OPÇÃO");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    for (int i = 0; i < users.length; i++) {
                        user = new Usuario();
                        System.out.println("CADASTRO CLIENTE");
                        System.out.print("NOME: ");
                        user.setNome(scan.next());
                        System.out.print("SOBRENOME: ");
                        user.setSobrenome(scan.next());
                        System.out.print("TELEFONE: ");
                        user.setTelefone(scan.next());
                        //clientes.add(user);
                        users[i] = user;
                    }

                    break;
                case 2:
                    if (users[0] == null) {
                        System.out.println("Nenhum Usuario cadastrado");
                        break;
                    }
                    System.out.println("CADASTRO CONTA");
                    System.out.print("AGENCIA: ");
                    conta.setAgencia(scan.next());
                    System.out.print("CONTA: ");
                    conta.setConta(scan.next());
                    System.out.println("CLIENTES CADASTRADOS");

                    for (int i = 0; i < users.length; i++) {
                        System.out.println((i + 1) + " - " + users[i].getNome() + " " + users[i].getSobrenome());
                    }

                    System.out.println("SELECIONE O CLIENTE");
                    int userOpcao = scan.nextInt();

                    for(int j = 0; j < users.length; j++) {
                        if(userOpcao-1 == j) {
                            conta.setProprietario(users[userOpcao-1]);
                            exist = true;
                        }
                    }
                    if (exist == false) {
                        System.out.println("Cliente não existe");
                        break;
                    }
                    System.out.print("SALDO: ");
                    conta.setSaldo(scan.nextDouble());
                    break;
                case 3:
                    System.out.println("ATE LOGO");
                    System.out.println("Cliente cadastrado " + conta.getProprietario().getNome());
                    break;
                default:
                    System.out.println("INVALIDO SEU BURRO");
            }

        }
    }
}