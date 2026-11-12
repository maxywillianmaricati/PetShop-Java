public abstract class Animal {
    private static int proximoId = 1;
    protected int id;
    protected String nome;

    public Animal(String nome){
        this.id = proximoId++;
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
