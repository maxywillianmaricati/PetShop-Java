import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = 0;
        int tipo;

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Servico> servicos = new ArrayList<>();

        while (op != 9) {
            System.out.println("Bem-vindo ao Sistema do Pet Shop!");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Pet");
            System.out.println("3 - Listar Clientes e Pets");
            System.out.println("4 - Buscar Cliente");
            System.out.println("5 - Buscar Pet");
            System.out.println("6 - Contratar Serviço");
            System.out.println("7 - Entregar Serviço");
            System.out.println("8 - Listar Serviços");
            System.out.println("9 - Sair");

            System.out.print("\nOpção: ");
            op = sc.nextInt();
            sc.nextLine();

            // cadastro cliente
            if (op == 1) {
                System.out.print("Nome do cliente: ");
                String nomeCliente = sc.nextLine();
                System.out.print("Telefone: ");
                String telefone = sc.nextLine();

                Cliente novoCliente = new Cliente(nomeCliente, telefone);
                clientes.add(novoCliente);
                System.out.println("\nCliente cadastrado!" +
                        "\nID do cliente " + nomeCliente + " :" + novoCliente.getId() + "\n");

            } else if (op == 2) {
                int idCliente;
                System.out.print("ID do cliente: ");
                idCliente = sc.nextInt();
                sc.nextLine();

                System.out.println("Qual seu animal?\n1-Cachorro\n2-Gato\n");
                System.out.println("Opção: ");
                tipo = sc.nextInt();
                sc.nextLine();

                // cadastro animal
                if (tipo == 1) {
                    System.out.print("Nome do cachorro: ");
                    String nomeDog = sc.nextLine();
                    System.out.print("Porte (P/M/G): ");
                    String porte = sc.nextLine();

                    for (Cliente pessoa : clientes) {
                        if (pessoa.getId() == idCliente) {
                            Cachorro dog = new Cachorro(nomeDog, porte);
                            pessoa.adicionaPet(dog);
                            System.out.println("\nDoguinho cadastrado para o cliente: " + pessoa.getNome());
                            System.out.println("\nID do cliente: " + pessoa.getId());
                        }

                    }
                    // nao consegui fazer uma funcao pra checar se o cliente existe
                    // e fazer funcionar toda vez :(
                    System.out.println("\nCliente não encontrado !\n" +
                            "- Digite um ID de cliente correto !! \n");
                }

                if (tipo == 2) {
                    System.out.print("Nome do gato: ");
                    String nomeGato = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();

                    for (Cliente pessoa : clientes) {
                        if (pessoa.getId() == idCliente) {
                            Gato gato = new Gato(nomeGato, idade);
                            pessoa.adicionaPet(gato);
                            System.out.println("Gatinho cadastrado para o cliente: " + pessoa.getNome());
                            System.out.println("ID do cliente: " + pessoa.getId());
                        }
                    }
                    if (idCliente < 1 || idCliente > clientes.size()) {
                        System.out.println("\nCliente não encontrado\n- Digite um ID de cliente correto !!! \n");
                    }
                }
                // listar clientes e pets
            } else if (op == 3) {
                for (Cliente pessoa : clientes) {
                    System.out.println("\n-- Pets de: " + pessoa.getNome() + " ---");
                    pessoa.listaPets();
                }
            }
        }
    }
}