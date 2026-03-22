package exerciciosJava2;

import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("-------CALCULADORA-------");

        System.out.print("digite o primeiro numero: ");
        int numero1 = leitor.nextInt();
        System.out.print("digite o segundo numero: ");
        int numero2 = leitor.nextInt();

        int soma = numero1 + numero2;
        int sub = numero1 - numero2;
        int mult = numero1 * numero2;

        System.out.println("A soma dos numeros é "+ soma);
        System.out.println("A subtraçao dos numeros é "+ sub);
        System.out.println("A multplicaçao dos numeros é "+ mult);


    }
}
