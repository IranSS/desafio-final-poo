package Models;

public class Regular extends Aluno{

    public Regular(String nome, String cpf, int idade, int matricula) {
        super(nome, cpf, idade, matricula);
    }
    @Override
    public void pagarMensalidade() {
        System.out.println("Aluno(a) Regular: " + getNome() + " - pagou a mensalidade");
    }
}
