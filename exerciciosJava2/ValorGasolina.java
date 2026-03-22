package exerciciosJava2;

import java.util.Scanner;

public class ValorGasolina {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double precoGasolina = 6.46D;

        System.out.print("digite a quantidade de litros: ");
        double litros = leitor.nextDouble();

        double precoFinal = precoGasolina * litros;

        System.out.println("cliente deverá pagar R$"+precoFinal);

    }
}
