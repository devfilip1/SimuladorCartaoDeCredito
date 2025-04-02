package simulador;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double saldo;
    private double limite;
    public List<Compra> compras;

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = this.limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra) {
        if (this.saldo >= compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

}
