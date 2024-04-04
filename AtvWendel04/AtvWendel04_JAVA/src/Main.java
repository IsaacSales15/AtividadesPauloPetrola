public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("José", "2007-02-27");
        pessoa.surname = "Zé bigode";
        System.out.println(pessoa.hello());

        Aluno aluno = new Aluno("Pedro", "2014-06-05", 1234);
        aluno.surname = "Pedrin do Java";
        aluno.hello();

        Professor prof = new Professor("Humberto", "1967-05-23", 12344, 2004 );
        prof.surname = "bebeto";
        prof.hello();

        Funcionario func = new Funcionario("Serjo","1978-12-25", "Porteiro", 2.4000, 1234 );
        func.surname = "Serjão foguetes";
        func.hello();
    }
}
