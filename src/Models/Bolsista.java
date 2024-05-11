package Models;

public class Bolsista extends Aluno{

    public Bolsista(String nome, String cpf, int idade, int matricula) {
        super(nome, cpf, idade, matricula);
    }
    @Override
    public void pagarMensalidade() {
        System.out.println("Aluno(a) Bolsista: " + getNome() + " - pagou a mensalidade");
    }
}
