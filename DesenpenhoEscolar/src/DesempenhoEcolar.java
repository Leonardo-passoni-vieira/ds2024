public class DesempenhoEcolar {
   private int rmEstudante;
   private String nomeEstudante;
   private int bimestre;
   private String curso;
   private String disciplina;
   private double n1;
   private double n2;
   private double n3;
   private String mencaoFinal;
   private int totalFalta;

public DesempenhoEcolar(int rm, double n1, double n2, 
double n3, int bim, String disciplina){
    this.rmEstudante = rm;
    this.bimestre = bim;
    this.disciplina = disciplina;
    this.n1 = n1;
    this.n2 = n2;
    this.n3 = n3;

}

public void setRmEstudante(int rmEstudante) {
    this.rmEstudante = rmEstudante;
}

public int getRmEstudante() {
    return rmEstudante;
}

public void setNome(String nome){
    this.nomeEstudante = nome;
}

public String getNome(){
    return this.nomeEstudante;
}

public void setBimestre(int bimestre) {
    this.bimestre = bimestre;
}

public int getBimestre() {
    return bimestre;
}

public void setCurso(String curso) {
    this.curso = curso;
}

public String getCurso() {
    return curso;
}

public void setDisciplina(String disciplina) {
    this.disciplina = disciplina;
}

public String getDisciplina() {
    return disciplina;
}

public void setN1(double n1) {
    this.n1 = n1;
}

public double getN1() {
    return n1;
}

public void setN2(double n2) {
    this.n2 = n2;
}

public double getN2() {
    return n2;
}

public void setN3(double n3) {
    this.n3 = n3;
}

public double getN3() {
    return n3;
}

public String getMencaoFinal() {
    return mencaoFinal;
}

public void setTotalFalta(int totalFalta) {
    this.totalFalta = totalFalta;
}

public int getTotalFalta() {
    return totalFalta;
}

public String calcularMencaoFinal(){
double media = (n1+n2+n3)/3;
    if (media > 8){
        this.mencaoFinal = "MB";
    }

    else if (media >= 7){
        this.mencaoFinal = "B";
    }

    else if (media >=6){
        this.mencaoFinal = "R";
    }

    else {
        this.mencaoFinal = "I";
    }

    return this.mencaoFinal;

}

@Override
public String toString(){
    return "RM:" +getRmEstudante()+"\t Disciplina:"+getDisciplina()+"\n Nome:" +getNome() +
    "\n Total de Faltas:"+getCurso()+"\t Disciplina:" +getDisciplina()+"\n";
}

}