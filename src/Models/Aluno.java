package Models;

public class Aluno extends Pessoa{
    private int matricula;

    public Aluno(String nome, String cpf, int idade, int matricula){
        super(nome, cpf, idade);
        this.matricula = matricula;
    }
    public void pagarMensalidade(){
        System.out.println(getNome() + " Pagou a mensalidade.");
    }
}
