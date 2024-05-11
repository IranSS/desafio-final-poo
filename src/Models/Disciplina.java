package Models;

public class Disciplina {
    private int codigo;
    private String nome;
    private int semestre;

    public Disciplina(String nome, int codigo, int semestre){
        this.nome = nome;
        this.codigo = codigo;
        this.semestre = semestre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
