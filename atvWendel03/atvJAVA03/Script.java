package atvJAVA03;
import java.util.Scanner;
import java.util.Arrays;

public class Script {
    public Scanner leia = new Scanner(System.in);
    public int[] numbers = new int[15];
    public int[] numbers2 = new int[15];
    public String[] letras = new String[7];
    
// Questão 1    
    public void ViewNumbers(){
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Coloque o "+ (i + 1) + "° número");
            numbers[i] = leia.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }

// Questão 2
    public void InvertNumbers(){
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Coloque o "+ (i + 1) + "° número");
            numbers2[i] = leia.nextInt();
        }
            int sizeArray = numbers2.length;
            int arrayCop [] = new int[sizeArray];
            int invArray = sizeArray -1;

        for(int i = 0; i < sizeArray; i++){
            arrayCop[i] = numbers2[invArray - i];
            System.out.print(arrayCop[i]);
        }
    }

// Questão 3
    public void Wowels(){
        for(int i = 0; i < letras.length; i++){
            System.out.println("Coloque a "+ (i + 1) + "° letra");
            letras[i] = leia.nextLine();

            if (letras[i] == "a" || letras[i] == "e"|| letras[i] == "i" || letras[i] == "o" || letras[i] == "u" ) {
                System.out.println(letras[i]);
            }
        }
    }     
}