import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
            op = scanner.nextInt();
            if(op==1){
                System.out.println("Id: ");
            }
        }
    }
}