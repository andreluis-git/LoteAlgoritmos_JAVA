package Lote.Proc_and_Function;
import javax.swing.JOptionPane;

/*
Objetivo:21.	Receba 4 notas bimestrais de um aluno. 
alcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
a.	Se a média for >= 6,0 exibir “APROVADO”;
b.	Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c.	Se a média for < 3,0 exibir “RETIDO”.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex21Proc {
	static double n1, n2, n3, n4;
	public static void main(String[] args) {
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do aluno: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do aluno: "));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota do aluno: "));
		n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota do aluno: "));
		calcMedia();
	}
	
	
	static void calcMedia() {
		double media;
		media = (n1 + n2 + n3 + n4)/4;
		if (media >= 6) {
			JOptionPane.showMessageDialog(null, "Aprovado, media: " + media);
		}
		else if (media < 3){
			JOptionPane.showMessageDialog(null, "Retido, media: " + media);			
		}
		else {
			JOptionPane.showMessageDialog(null, "Exame, media: " + media);
		}
	}
}