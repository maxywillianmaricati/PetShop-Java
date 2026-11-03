public class Gato extends Animal {
    private int idadeAnos;

    @Override
    public String descricao() {
        return "Nome do Gato: " + this.nome + ", Idade: " + this.idadeAnos;
    }
}
