package ATIVIDADE;
import java.util.Calendar;

public class Calc {
//Questão 1
    public int n1, n2;
    public String op;

    public void Soma(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;

        System.out.println("O resultado é " + (n1 + n2));
    }
//Questão 2

    public void Operacao(String op, int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
        this.op = op;

        if (op.equalsIgnoreCase("+")) {
            System.out.println("O resultado é " + (n1 + n2));
        }
        else if (op.equalsIgnoreCase("-")){
            System.out.println("O resultado é " + (n1 - n2));
        }
        else if (op.equalsIgnoreCase("*")){
            System.out.println("O resultado é " + (n1 * n2));
        }
        else if (op.equalsIgnoreCase("/")){
            System.out.println("O resultado é " + (n1 / n2));
        }
        else {
            System.out.println("Inválido");
        }
    }
// Questão 3
    public String Hora(){
        Calendar hora = Calendar.getInstance();
        Calendar now = new Calendar();
        int horario;
        horario = now.get(Calendar.HOUR_OF_DAY);

        if (horario >= 5 || horario <= 11){
            System.out.println("Bom dia");
        }
        else if(horario >= 12 || horario <= 18) {
            System.out.println("Boa tarde");
        }
        else if(horario >= 19 || horario <= 23) {
            System.out.println("Boa noite");
        }
        else if(horario >= 24 || horario <= 4) {
            System.out.println("Vai dormir, seu fela!");
        }
    } 
}