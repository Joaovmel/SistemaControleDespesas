package modelo;

public class RegistroDespesa {
    private String descricao;
    private double valor;
    private String data;

    // Construtor - usado para criar uma nova despesa
    public RegistroDespesa(String descricao, double valor, String data) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    // Getters - servem para acessar os valores das variáveis
    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    // Para imprimir a despesa de forma bonita
    @Override
    public String toString() {
        return descricao + " - R$" + valor + " - Data: " + data;
    }
}
