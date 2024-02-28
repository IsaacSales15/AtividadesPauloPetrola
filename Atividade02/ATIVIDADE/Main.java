package ATIVIDADE;
import java.util.Scanner;
import ATIVIDADE.Calc;
import java.util.Calendar;

public class Main{
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        Calc calc = new Calc();

        System.out.println("Coloque o primeiro número: ");
        calc.n1 = leia.nextInt();

        System.out.println("Coloque o segundo número: ");
        calc.n2 = leia.nextInt();

        System.out.println("Coloque a operação: ");
        calc.op = leia.next();

        calc.Hora();
        //calc.Operacao(calc.op,calc.package ATIVIDADE;package ATIVIDADE;n1, calc.n2);
        //calc.Soma(calc.n1, calc.n2);
        
        leia.close();
    }
}
