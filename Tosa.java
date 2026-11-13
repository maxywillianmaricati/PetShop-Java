public class Tosa implements Servico {
    private static int proximoId = 1;
    private int id;
    private double preco;
    private boolean pronto;
    private Animal pet;

    public Tosa(Animal pet) {
        this.id = proximoId++;
        this.pet = pet;
        this.preco = 60;
        this.pronto = false;
    }

    // acrescentei pra deixar o status completo
public String getStatus() {
    if (this.pronto) {
        return "Serviço concluído";
    }
    return "Em andamento";
}

    public int getId() {
        return this.id;
    }

    @Override
    public String getDescricao() {
        return "Tosa para " + pet.getNome() + " - Preço: R$ " + this.preco + " | Status: " + this.getStatus();
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public boolean isPronto() {
        return this.pronto = true;
    }

    @Override
    public Animal getPet() {
        return this.pet;
    }

    @Override 
    public void marcarPronto() {
        this.pronto = true;
    }

}