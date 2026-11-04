public class Cachorro extends Animal {
    private String porte;

    public Cachorro(int id, String nome, String porte){
        super(id, nome);
        this.porte = porte;
    }

    @Override
    public String descricao() {
        return "[" + this.id + "] " + this.nome + " - Cachorro de porte " + this.porte;
    }
}