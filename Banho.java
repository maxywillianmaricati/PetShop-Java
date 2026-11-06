public class Banho implements Servico {
    private double preco;
    private boolean pronto;
    private Animal pet;

    public Banho(Animal pet){
        this.pet = pet;
        this.preco = 50;
    }

    //adicionar o Status
    @Override
    public String getDescricao() {
        return "Banho para " + pet.getNome() + " - Preço: R$ " + this.preco + " | Status: ";
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
