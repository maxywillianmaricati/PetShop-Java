import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = 0;
        int tipo;

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Servico> servicos = new ArrayList<>();

        while (op!=9) {
            System.out.println("\nBem-vindo ao Sistema do Pet Shop!");
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

            //cadastro cliente
            if (op==1) {
                System.out.print("Nome do cliente: ");
                String nome = sc.nextLine();
                System.out.print("Telefone: ");
                String telefone = sc.nextLine();

                Cliente novoCliente = new Cliente(nome, telefone);
                clientes.add(novoCliente);
                System.out.println("Cliente cadastrado!");

            } else if (op==2) {
                System.out.print("ID do cliente: ");
                int idCliente = sc.nextInt();
                sc.nextLine();

                System.out.print("Qual seu animal?\n(1-Cachorro\n2-Gato)\nOpção: ");
                tipo = sc.nextInt();
                sc.nextLine();

                //cadastro animal
                if (tipo==1) {
                    System.out.print("Nome do cachorro: ");
                    String nome = sc.nextLine();
                    System.out.print("Porte (P/M/G): ");
                    String porte = sc.nextLine();


                    Cliente dono = null;
                    for (Cliente c : clientes) {
                        if (c.getId() == idCliente) {
                            dono = c;
                        }
                    }

                    if (dono == null) {
                        System.out.println("Cliente não existe");
                    } else {
                        Cachorro novoDog = new Cachorro(nome, porte);
                        dono.adicionaPet(novoDog);
                        System.out.println("Cachorro cadastrado com sucesso");
                    }
                }

                if (tipo == 2) {
                    System.out.print("Nome do gato: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade do gato: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    Cliente dono = null;
                    for (Cliente c : clientes) {
                        if (c.getId() == idCliente) {
                            dono = c;
                        }
                    }

                    if (dono == null) {
                        System.out.println("Cliente não existe");
                    } else {
                        Gato novoGato = new Gato(nome, idade);
                        dono.adicionaPet(novoGato);
                        System.out.println("Gato cadastrado com sucesso" );
                    }
                }
            }
            
        }
    }
}