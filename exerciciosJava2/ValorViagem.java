package exerciciosJava2;

import java.util.Scanner;

public class ValorViagem {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double alemanha = 6000;
        double portugal =  4288;
        double italia = 5000;

        System.out.print("informe quantos pessoas irao para alemanha: ");
        int pessoasAlemanha = leitor.nextInt();

        System.out.print("informe quantas pessoas irao para portugal: ");
        int pessoasPortugal = leitor.nextInt();

        System.out.print("informe quantas pessoas irao para italia: ");
        int pessoasItalia = leitor.nextInt();

        double precoFinal = (pessoasAlemanha * alemanha) + (pessoasPortugal * portugal) + (pessoasItalia * italia);
        int totalPessoas = pessoasAlemanha + pessoasPortugal + pessoasItalia;

        System.out.println("Valor total das viagems "+precoFinal);
        System.out.println("Total de pessoas "+totalPessoas);
        






    }
}
