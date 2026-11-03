public class Consulta implements Servico {
    private Animal pet;
    private boolean pronto;
    private double preco;

    @Override
    public String getDescricao() {
        return "Consulta para: " + this.pet.descricao();
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
