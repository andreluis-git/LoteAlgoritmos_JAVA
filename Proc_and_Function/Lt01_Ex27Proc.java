package Lote.Proc_and_Function;
import javax.swing.JOptionPane;

/*
Objetivo:27.	Receba o n�mero de voltas, a extens�o do circuito (em metros) 
e o tempo de dura��o (minutos). Calcule e mostre a velocidade m�dia em km/h.
Nome: Andr� Luis
Data: 2020-02-17
*/

public class Lt01_Ex27Proc {
	static double extensao, voltas, duracao;
	public static void main(String[] args) {
		voltas = Double.parseDouble(JOptionPane.showInputDialog("Digite o n�mero de voltas: "));
		duracao = Double.parseDouble(JOptionPane.showInputDialog("Digite a dura��o em minutos: "));
		extensao = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensao em metros: "));
		calcVelocidade();
	}
	
	
	static void calcVelocidade() {
		double velocidade;
		velocidade = ((voltas * extensao) / 1000) / (duracao/60);
		JOptionPane.showMessageDialog(null, "A valocidade m�dia foi de " + Math.round(velocidade) + " Km/h.");
	}
}