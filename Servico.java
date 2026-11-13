public interface Servico {
    String getDescricao();

    double getPreco();

    boolean isPronto();

    Animal getPet();

    int getId();
    
    void marcarPronto();
}
