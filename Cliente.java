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

    public int getId(){ return this.id; }

    public String getNome(){ return this.nome; }

    public String getTelefone(){ return this.telefone; }

    public void adicionaPet(Animal pet) {
        this.pets.add(pet);
    }

    public void listaPets(){
        if(this.pets.size() == 0){
            System.out.println("Sem animais");
        }
    for(int i=0;i<this.pets.size();i++){
        System.out.println(" * "this.pets.get(i).descricao());
    }
    }


    public Animal buscaPet(int id) {
    for (int i = 0; i < pets.size(); i++) {
        if (pets.get(i).getId() == id) {
            return pets.get(i);
        }
    }
    return null;
}