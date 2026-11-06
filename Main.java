import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;

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
                System.out.println("ID: ");
                int id = sc.nextInt();
                System.out.println("Nome: ");
                String nome = sc.nextLine();
                System.out.println("Telefone: ");
                String telefone = sc.nextLine();
                Cliente c1 = new Cliente(id,nome,telefone); 
            } else if (op == 2){
                System.out.println();
            }
                
        }
    }
}