public class Gato extends Animal {
    private int idadeAnos;

    public Gato(String nome, int idadeAnos) {
        super(nome);
        this.idadeAnos = idadeAnos;
    }

    @Override
    public String descricao() {
        return this.nome + " é um Gato com " + this.idadeAnos + " anos de idade";
    }
}
