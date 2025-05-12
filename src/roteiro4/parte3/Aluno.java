package roteiro4.parte3;

public class Aluno {

    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;

    Aluno(int pMatricula, String pNome, String pCurso, int pAnoIngresso) {
        matricula = pMatricula;
        nome = pNome;
        curso = pCurso;
        anoIngresso = pAnoIngresso;
    }

    //Mátricula
    public int getMatricula() { return matricula; }
    public void setMatricula(int pMatricula) { matricula = pMatricula;}

    //Nome
    public String getNome() { return nome; }
    public void setNome(String pNome) { nome = pNome; }

    //Curso
    public String getCurso() { return curso; }
    public void setCurso(String pCurso) { curso = pCurso; }

    //Ano Ingresso
    public int getAnoIngresso() { return anoIngresso; }
    public void setAnoIngresso(int pAnoIngresso) { anoIngresso = pAnoIngresso; }

}
