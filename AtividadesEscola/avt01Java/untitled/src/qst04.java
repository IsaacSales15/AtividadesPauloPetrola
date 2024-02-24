import java.util.Scanner;

public class qst04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        while (true) {
            System.out.println("Digite a hora atual: ");
            int hora = leia.nextInt();

            if (hora >= 5 && hora <= 11) {
                System.out.println("Bom dia!");
            } else if (hora >= 12 && hora <= 18) {
                System.out.println("Boa tarde!");
            } else if (hora >= 19 && hora <= 23) {
                System.out.println("Boa noite!");
            } else if (hora <= 4 || hora >= 24) {
                System.out.println("Vai dormir, seu fela!");
            }
        }
    }
}