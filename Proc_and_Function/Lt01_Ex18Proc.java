package Lote.Proc_and_Function;
import javax.swing.JOptionPane;

/*
Objetivo:18.	Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex18Proc {
	static double numA, numB;
	public static void main(String[] args) {
		numA = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		numB = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
		calcDiff();
	}	
	
	
	static void calcDiff() {
		double diff;
		if (numA > numB) {
			diff = numA - numB;
		}
		else {
			diff = numB - numA;
		}
		JOptionPane.showMessageDialog(null, "A diferença entre os números digitados é: " 
				+ String.format("%.2f", diff));
	}
}