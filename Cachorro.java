public class Cachorro extends Animal {
    private String porte;

    public Cachorro(String nome, String porte){
        super(nome);
        this.porte = porte;
    }

    @Override
    public String descricao() {
        return "[" + this.id + "] " + this.nome + " - Cachorro de porte " + this.porte;
    }
}