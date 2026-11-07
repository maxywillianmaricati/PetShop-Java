import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int op = 0;
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Servico> servicos = new ArrayList<>();

        public static void cadastroCliente(){
        System.out.println("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.printf("\n--- Cadastro de cliente ---\nNome: ");
        String nome = sc.nextLine();

        System.out.println("Telefone: ");
        String telefone = sc.nextLine();

        Cliente c = new Cliente(id, nome, telefone);
        clientes.add(c);
        System.out.println("--- Cliente cadastrado ---");

    }
        while (op != 9) {
            System.out.print("\n===== PetShop =====\n" +
                    "1 - Cadastrar Cliente\n" +
                    "2 - Cadastrar Pet\n" +
                    "3 - Listar Clientes e Pets\n" +
                    "4 - Buscar Cliente\n" +
                    "5 - Buscar Pet\n" +
                    "6 - Contratar Serviço\n" +
                    "7 - Entregar Serviço\n" +
                    "8 - Listar Serviços\n" +
                    "9 - Sair\n");

            System.out.printf("\nOpção: ");
            op = sc.nextInt();


            if(op==1){
                cadastroCliente();

            }else if(op == 2){
                System.out.println("Cadastrar PET");
            }
        }
    }




}