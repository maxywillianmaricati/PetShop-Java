public abstract class Animal {
    protected int id;
    protected String nome;

    public Animal(int id , String nome){
        this.id = id;
        this.nome = nome;
    }


    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public abstract String descricao();
}
