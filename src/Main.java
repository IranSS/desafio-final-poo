import Models.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Disciplina disciplina1 = new Disciplina("Raciocionio Lógico", 8569, 1);
        Disciplina disciplina2 = new Disciplina("Programação orient. objetos", 2569, 2);
        Disciplina disciplina3 = new Disciplina("Algoritmos", 5896, 3);

        Aluno aluno1 = new Regular("Carlos", "856.958.698-36", 22, 2566983);
        Aluno aluno2 = new Regular("Raquel", "258.368.985-28", 20, 2336587);
        Aluno aluno3 = new Bolsista("Felipe", "253.698.587-42", 24, 235547);

        Professor professor1 = new Professor("Pedro", "259.235.698-23", 43, "CST");

        Visitante visitante1 = new Visitante("Bruno", "536.998.213-39", 22);
        Visitante visitante2 = new Visitante("Rayane", "256.698.358-35", 28);

        Turma turma1 = new Turma(258, disciplina1, professor1);
        Turma turma2 = new Turma(586, disciplina2, professor1);
        Turma turma3 = new Turma(589, disciplina3, professor1);

        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);
        turma1.adicionarAluno(aluno3);

        turma2.adicionarAluno(aluno1);
        turma2.adicionarAluno(aluno2);
        turma2.adicionarAluno(aluno3);

        turma3.adicionarAluno(aluno1);
        turma3.adicionarAluno(aluno2);
        turma3.adicionarAluno(aluno3);

        System.out.println("\n----------- Turma 1 -----------");
        System.out.println(turma1);
        turma1.listarAlunos();

        System.out.println("\n----------- Turma 2 -----------");
        System.out.println(turma2);
        turma2.listarAlunos();

        System.out.println("\n----------- Turma 3 -----------");
        System.out.println(turma3);
        turma3.listarAlunos();
    }
}