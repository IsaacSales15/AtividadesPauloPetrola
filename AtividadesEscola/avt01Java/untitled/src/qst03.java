import java.util.Scanner;
public class qst03 {
    public static void main(String[] args) {
        while (true) {
            Scanner leia = new Scanner(System.in);

            System.out.println("Digite o seu nome: ");
            String nome = leia.nextLine();

            int i = 0;

            while (i <= 10){
                System.out.println("Buenos días " + nome);
                i++;
            }
        }
    }
}
