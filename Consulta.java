public class Consulta implements Servico {
    private static int proximoId = 1;
    private int id;
    private Animal pet;
    private boolean pronto;
    private double preco;

    public Consulta(Animal pet) {
        this.id = proximoId++;
        this.pet = pet;
        this.preco = 120;
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
        return "Consulta para " + this.pet.getNome() + " - Preço: R$ " + this.preco + " | Status: " + this.getStatus();
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

    @Override 
    public void marcarPronto() {
        this.pronto = true;
    }

}
