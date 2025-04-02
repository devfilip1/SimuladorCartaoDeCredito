package simulador;

import simulador.*;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double  limite = sc.nextDouble();
        var cartao = new CartaoDeCredito(limite);

        int sair = -1;
        while (sair != 0) {
            System.out.println("Digite a descrição da compra: ");
            String descricao = sc.next();
            System.out.println("Digite o valor da compra: ");
            int valor = sc.nextInt();

            Compra compra = new Compra(descricao, valor);

            if (cartao.lancaCompra(compra)) {
                System.out.println("Compra realizada com sucesso!");
            } else {
                System.out.println("Créditos insuficiente!\n");
                System.out.println("***********************************");
                System.out.println("COMPRAS REALIZADAS: \n");
                Collections.sort(cartao.getCompras());

                for (Compra c : cartao.getCompras()) {
                    System.out.println(c);
                }
                System.out.println("\n***********************************");
                System.out.println("\nSaldo do cartão: " + cartao.getSaldo() + "\n");
            }

            System.out.println("Digite 0 para sair e 1 para contiuar");
            sair = sc.nextInt();
        }



    }
}
