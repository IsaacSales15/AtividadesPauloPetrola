public class Funcionario extends Pessoa {
    private int mtr;
    private String funcao;
    private Double salario;

    public Funcionario(String name, String birthDate, String funcao, Double salario, int mtr) {
        super(name, birthDate);
        this.funcao = funcao;
        this.salario = salario;
        this.mtr = mtr;
    }

    public int getMtr() {
        return mtr;
    }

    public String getFuncao() {
        return funcao;
    }

    public double getSalario() {
        return salario;
    }
    @Override
    public String hello() {
        String superMessage = super.hello();
        return superMessage + " Minha matrícula é: " + this.mtr + ", meu cargo é " + this.funcao + " e o meu salário é de " + this.salario;
    }
}


