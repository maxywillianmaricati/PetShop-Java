public class Tosa implements Servico {
    private double preco;
    private boolean pronto;
    private Animal pet;

    @Override
    public String getDescricao() {
        return "Tosa para: " + pet.getNome();
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