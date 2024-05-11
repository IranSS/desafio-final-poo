package Models;

public class Professor extends Pessoa{
    private String centro;

    public Professor(String nome, String cpf, int idade, String centro){
        super(nome, cpf, idade);
        this.centro = centro;
    }
    public void darAula(){
        System.out.println("O professor(a) " + getNome() + " está em aula.");
    }
}
