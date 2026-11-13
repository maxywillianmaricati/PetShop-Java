import java.util.ArrayList;

public class Cliente {
    private static int proximoId = 1;
    private int id;
    private String nome;
    private String telefone;
    private ArrayList<Animal> pets;

    public Cliente(String nome, String telefone) {
        this.id = proximoId++;
        this.nome = nome;
        this.telefone = telefone;
        this.pets = new ArrayList<Animal>();
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void adicionaPet(Animal pet) {
        this.pets.add(pet);
    }

    public void listaPets() {
        if (this.pets.size() == 0) {
            System.out.println("Sem animais");
        }

        for (Animal animal : pets) {
            System.out.println("ID do Pet: " + animal.getId() + "\nDescrição: " + animal.descricao());
        }
    }

    public Animal buscaPet(int id) {
        for (Animal animal : pets) {
            if (animal.getId() == id) {
                return animal;
            }
        }
        return null;
    }
}