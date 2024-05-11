package Models;

import java.util.ArrayList;

public class Turma {
    private int codigo;
    private Disciplina disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Turma(int codigo, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void removerAluno(int indexAluno){
        if (indexAluno >= 0 && indexAluno < alunos.size()) {
            alunos.remove(indexAluno);
        }
    }

    public void listarAlunos(){
        System.out.print("Alunos: ");
        int cont = 0;

        for(Aluno aluno : alunos){
            if(cont > 0){
                System.out.print(", ");
            }
            System.out.print(aluno.getNome());
            cont++;
        }
        System.out.print(".\n");
    }

    public int getCodigo() {
        return codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    @Override
    public String toString() {
        return  "Codigo: " + codigo + "." +
                "\nDisciplina: " + disciplina.getNome() + "." +
                "\nProfessor(a): " + professor.getNome() + ".";
    }
}
