public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Pedro", "2004-02-27");
        pessoa.surname = "Zé bigode";
        System.out.println(pessoa.hello());
    }
}
