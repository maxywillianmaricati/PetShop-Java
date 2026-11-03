public class Banho implements Servico {
    double preco;
    boolean pronto;
    Animal pet;

    @Override
    public String getDescricao() {
        return "Banho para: " + pet.getNome();
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
