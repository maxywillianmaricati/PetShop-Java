import java.util.ArrayList;

public class Cliente {
    private int id;
    private String nome;
    private String telefone;
    private ArrayList<Animal> pets;

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.pets = new ArrayList<Animal>();
    }

    public void adicionaPet(Animal pet) {
        this.pets.add(pet);
    }

    

}
