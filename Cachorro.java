public class Cachorro extends Animal {
    private String porte;

    @Override
    public String descricao() {
        return "Nome do Cachorro: " + this.nome + ", Porte: " + this.porte;
    }

}
