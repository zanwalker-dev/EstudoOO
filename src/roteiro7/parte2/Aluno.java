package roteiro7.parte2;

public class Aluno {

    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;
    private String situacao;
    private int qtdeDisciplina;

    public Aluno(int matricula, String nome, String curso, int anoIngresso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
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

    //Quantidade de Disciplinas
    public int getQtdeDisciplina() { return qtdeDisciplina; }
    public void setQtdeDisciplina( int pQtdeDisciplina){
        if(situacao.equalsIgnoreCase("matriculado") && pQtdeDisciplina > 0){
            qtdeDisciplina = pQtdeDisciplina;
        } else if(situacao.equalsIgnoreCase("matriculado") && pQtdeDisciplina <= 0){
            qtdeDisciplina++;
        } else {
            qtdeDisciplina = 0;
        }
    }

    //Situação
    public String getSituacao() { return situacao; }
    public void setSituacao(String pSituacao) {
        //professor, escrevi esse if só para padronizar independente de como a pessoa escreva
        //ele continuará sendo com a primeira letra maiuscula e sem acento.
        if (pSituacao.equalsIgnoreCase("matriculado")) {
            situacao = "Matriculado";
        } else if (pSituacao.equalsIgnoreCase("nao matriculado")) {
            situacao = "Não matriculado";
        }
    }

}
