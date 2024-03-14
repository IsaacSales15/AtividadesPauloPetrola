package atvJAVA03;

import java.util.Scanner;
import java.util.Arrays;

public class Script {
    public Scanner leia = new Scanner(System.in);
    // Questão 1
    public int[] numbers = new int[15];
    // Questão 2
    public int[] numbers2 = new int[15];
    // Questão 3
    public String[] letras = new String[7];
    // Questão 4
    public double[] average = new double[10];
    String[] names = new String[10];

    // Questão 1
    public void ViewNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Coloque o " + (i + 1) + "° número");
            numbers[i] = leia.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }

    // Questão 2
    public void InvertNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Coloque o " + (i + 1) + "° número");
            numbers2[i] = leia.nextInt();
        }
        int sizeArray = numbers2.length;
        int arrayCop[] = new int[sizeArray];
        int invArray = sizeArray - 1;

        for (int i = 0; i < sizeArray; i++) {
            arrayCop[i] = numbers2[invArray - i];
            System.out.print(arrayCop[i]);
        }
    }

    // Questão 3
    public void Wowels() {
        for (int i = 0; i < letras.length; i++) {
            System.out.println("Coloque a " + (i + 1) + "° letra");
            letras[i] = leia.nextLine();

            if (letras[i].equals("a") || letras[i].equals("e") || letras[i].equals("i") || letras[i].equals("o") || letras[i].equals("u")) {
                System.out.println(letras[i]);
            }
        }
    }

    // Questão 4
    public void ViewAverage() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            names[i] = leia.nextLine();

            double sum = 0;

            for (int j = 0; j < 4; j++) {
                System.out.println("Digite a nota " + (j + 1) + " do aluno " + names[i] + ":");
                double note = leia.nextDouble();
                sum += note;
            }

            double m = sum / 4;
            average[i] = m;
            leia.nextLine();
        }

        System.out.println("Médias maiores que 7:");
        for (int i = 0; i < 10; i++) {
            if (average[i] > 7) {
                System.out.println("Aluno: " + names[i] + " - Média: " + average[i]);
            }
        }
    }
}
