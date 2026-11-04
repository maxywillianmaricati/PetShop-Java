public class Consulta implements Servico {
    private Animal pet;
    private boolean pronto;
    private double preco;

    public Consulta(Animal pet){
        this.pet = pet;
        this.preco = 120;
    }

    //adicionado pra conseguir deixar o getDescricao bonitinho
    public String getStatus(){
        if(this.pronto){
            return "PRONTO";
        }
        return "EM ANDAMENTO";
    }

    @Override
    public String getDescricao() {
        return "Consulta para " + this.pet.getNome() + " - Preço: R$ " + this.preco + " | Status: " + getStatus();
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public boolean isPronto() {
        return this.pronto;
    }

    @Override
    public Animal getPet() {
        return this.pet;
    }

    public void marcarPronto() {
        this.pronto = true;
    }

}
