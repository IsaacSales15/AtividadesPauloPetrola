//import java.time.LocalTime;

public class Aluno extends Pessoa{
    //Atributos
    private int mtr;
    private String curso;

    public Aluno(String name, String birthDate, int matricula) {
        super(name, birthDate);
        this.mtr = mtr;
    }

    public int getMtr(){
        return mtr;
    }
    public String getCurso(){
        return curso;
    }
    public String hello() {
        String superMessage = super.hello();
        return superMessage + "minha matricula é " + getMtr();
    }
}

