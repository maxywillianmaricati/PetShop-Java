public class Gato extends Animal {
    private int idadeAnos;

    public Gato(int id, String nome, int idadeAnos){
        super(id, nome);
        this.idadeAnos = idadeAnos; 
    }

    @Override
    public String descricao() {
        return "[" + this.id + "] " + this.nome + " - Gato com " + this.idadeAnos + " anos de idade";
    }
}
