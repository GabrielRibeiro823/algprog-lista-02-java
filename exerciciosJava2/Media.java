package exerciciosJava2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("-------SISTEMAS DE MEDIAS DE NOTAS-------");

        System.out.print("digite a primeira nota: ");
        double nota1 = leitor.nextDouble();
        System.out.print("digite a segundo nota: ");
        double nota2 = leitor.nextDouble();
        System.out.print("digite a terceiro nota: ");
        double nota3 = leitor.nextDouble();
        System.out.print("digite a quarto nota: ");
        double nota4 = leitor.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A media das notas sao " + media);

    }
}
