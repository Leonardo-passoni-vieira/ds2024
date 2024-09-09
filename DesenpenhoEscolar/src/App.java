import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Registro de desempenho escolat de estudante");

        List<DesempenhoEcolar> turma = new ArrayList<DesempenhoEcolar>();

        for(int i=0; i<10; i++){

        int rm = Integer.parseInt (JOptionPane.showInputDialog(null,"Informe o RM do estudante "));
        String disciplina = JOptionPane.showInputDialog(null, "Informe o nome da disciplina ");
        int bim = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o bimestre (apenas número)"));
        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a primeia nota")); 
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a segunda nota"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a terceira nota"));

        DesempenhoEcolar historico = new DesempenhoEcolar(rm, n1, n2, n3, bim, disciplina);

        String Nome = JOptionPane.showInputDialog(null, "Informe o nome do estudante");
        historico.setNome(Nome);

        String Curso = JOptionPane.showInputDialog(null, "Informe em qual curso se encontra o estudante");
        historico.setCurso(Curso);

        int totalFalta = Integer.parseInt (JOptionPane.showInputDialog(null,"Informe quantas faltas o estudante teve ao todo"));
        historico.setTotalFalta(totalFalta);
        turma.add(historico);
        }

        for(int i=0; i<10; i++){

        System.out.println(turma.get(i));
        System.out.println();

        }

    }
}
