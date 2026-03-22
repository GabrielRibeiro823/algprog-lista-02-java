package exerciciosJava2;

import java.util.Scanner;

public class LeitorDeNumero {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        //lendo um o numero
        System.out.print("digite um numero: ");
        int num = numero.nextInt();

        //Exibindo numero no terminal
        System.out.println("Voce digitou o numero "+num);
    }
}
