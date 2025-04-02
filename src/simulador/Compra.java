package simulador;


public class Compra implements Comparable<Compra> {
    private String nome;
    private double valor;

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public Compra(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }


    @Override
    public String toString() {
        return "Compra: " + nome + " |" + " Valor: " + valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}


