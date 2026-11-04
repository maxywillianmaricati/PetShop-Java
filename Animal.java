public abstract class Animal {
    protected int id;
    protected String nome;

    public Animal(String nome){
        this.id = this.getId();
        this.nome = this.getNome();
    }


    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public abstract String descricao();
}
