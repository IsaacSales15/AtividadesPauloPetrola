public class Professor extends Aluno {
    private int anoFormacao;

    public Professor(String name, String birthDate, int matricula, int anoFormacao) {
        super(name, birthDate, matricula);
        this.anoFormacao = anoFormacao;
    }
    public String hello() {
        String superMessage = super.hello();
        return superMessage + " e eu me formei em " + this.anoFormacao;
    }
}
