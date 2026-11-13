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

            // cadastro cliente
            if (op == 1) {
                System.out.print("=== Informações do Cliente ===\nNome do cliente: ");
                String nomeCliente = sc.nextLine();
                System.out.print("Telefone: ");
                String telefone = sc.nextLine();

                Cliente novoCliente = new Cliente(nomeCliente, telefone);
                clientes.add(novoCliente);
                System.out.println("\nCliente cadastrado!" +
                        "\nID do cliente " + nomeCliente + " :" + novoCliente.getId() + "\n");

            } else if (op == 2) {
                // cadastro de animal
                int idCliente;
                System.out.print("ID do cliente: ");
                idCliente = sc.nextInt();
                sc.nextLine();

                boolean existe = false;
                for (Cliente pessoa : clientes) {
                    if (pessoa.getId() == idCliente) {
                        existe = true;
                        System.out.println("Qual seu animal?\n1-Cachorro\n2-Gato\nOpção: ");
                        tipo = sc.nextInt();
                        sc.nextLine();

                        if (tipo == 1) {
                            System.out.print("=== Informações do Cachorrinho ===\nNome do cachorro: ");
                            String nomeDog = sc.nextLine();
                            System.out.print("Porte (P/M/G): ");
                            String porte = sc.nextLine();

                            Cachorro dog = new Cachorro(nomeDog, porte);
                            pessoa.adicionaPet(dog);
                            System.out.println("Cachorrinho cadastrado com sucesso");

                        } else if (tipo == 2) {
                            System.out.print("=== Informações do Gatinho ===\nNome do gato: ");
                            String nomeGato = sc.nextLine();
                            System.out.print("Anos de idade: ");
                            int idade = sc.nextInt();

                            Gato gato = new Gato(nomeGato, idade);
                            pessoa.adicionaPet(gato);
                            System.out.println("Gatinho cadastrado com sucesso");

                        } else {
                            System.out.println("[!] Escolha uma opção válida");
                        }
                        break;
                    }
                }

                if (!existe) {
                    System.out.println("\n[!] Cliente NÃO encontrado!\n");
                }

            } else if (op == 3) {
                // listar clientes e pets
                for (Cliente pessoa : clientes) {
                    System.out.println("\n=== Ficha do Cliente ===");
                    System.out.println("ID: " + pessoa.getId() + " | Nome: " + pessoa.getNome() +" | Telefone: " + pessoa.getTelefone());
                    System.out.println("- Pets de " + pessoa.getNome());
                    pessoa.listaPets();
                }

            } else if (op == 4) {
                // buscar cliente
                System.out.println("\n--- Encontrar cliente ---\nID do cliente: ");

                int idCliente = sc.nextInt();
                sc.nextLine();
                boolean existe = false;

                for (Cliente pessoa : clientes) {
                    if (pessoa.getId() == idCliente) {
                        existe = true;
                        System.out.println("\n=== Cliente encontrado ===");
                        System.out.println("ID: " + pessoa.getId());
                        System.out.println("Nome: " + pessoa.getNome());
                        System.out.println("Telefone: " + pessoa.getTelefone());
                        break;
                    }
                }

                if (!existe) {
                    System.out.println("[!] Cliente NÃO encontrado");
                }

            } else if (op == 5) {
                // buscar pet
                System.out.println("\n--- Encontrar Pet ---\nID do pet: ");
                int idPet = sc.nextInt();
                sc.nextLine();
                boolean existe = false;

                for (Cliente pessoa : clientes) {
                    Animal animalEncontrado = pessoa.buscaPet(idPet);

                    if (animalEncontrado != null) {
                        existe = true;
                        System.out.println("\n=== Pet encontrado! ===");
                        System.out.println("Dono: " + pessoa.getNome());
                        pessoa.listaPets();
                        break;
                    }
                }

                if (!existe) {
                    System.out.println("[!] Pet NÃO encontrado");
                }

            } else if (op == 6) {
                // contratar servico
                Animal animalEncontrado = null;
                System.out.println("ID do Pet: ");
                int idPet = sc.nextInt();
                sc.nextLine();

                for (Cliente pessoa : clientes) {
                    animalEncontrado = pessoa.buscaPet(idPet);

                    if (animalEncontrado != null) {
                        break;
                    }
                }

                if (animalEncontrado == null) {
                    System.out.println("\n[!] Pet NÃO encontrado!");
                } else {
                    System.out.println("=== Serviços ===");
                    System.out.println("1-Banho (R$50)\n2-Tosa (R$60)\n3-Consulta (R$120)\nOpção: ");

                    int servico = sc.nextInt();
                    sc.nextLine();

                    switch (servico) {
                        case 1:
                            Banho banho = new Banho(animalEncontrado);
                            servicos.add(banho);
                            System.out.println(banho.getDescricao());
                            break;

                        case 2:
                            Tosa tosa = new Tosa(animalEncontrado);
                            servicos.add(tosa);
                            System.out.println(tosa.getDescricao());
                            break;

                        case 3:
                            Consulta consulta = new Consulta(animalEncontrado);
                            servicos.add(consulta);
                            System.out.println(consulta.getDescricao());
                            break;

                        default:
                            System.out.println("Serviço inválido!");
                    }
                }

            } else if (op == 7) {
                // entregar serviço
                System.out.println("=== Marcar como pronto o serviço ===\nID do serviço: ");
                int idServico = sc.nextInt();
                sc.nextLine();

                Servico servicoExiste = null;
                for (Servico servico : servicos) {
                    if (servico.getId() == idServico) {
                        servico.marcarPronto();
                        System.out.println("--- Serviço entregue ---");
                        System.out.println(servico.getDescricao());
                    } else {
                        System.out.println("[!] Serviço NÃO encontrado");
                    }
                }

            } else if (op == 8) {
                System.out.println("\n=== Serviços ===");
                for (Servico servico : servicos) {
                    if (servicos.size() > 1) {
                        System.out.println(servico.getDescricao());
                    } else {
                        System.out.println("[!] Sem serviços");
                    }
                }

            } else if (op == 9) {
                System.out.println("[!] Fechando o pograma...");
            }
        }
    }
}