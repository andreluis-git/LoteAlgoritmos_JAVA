package Lote.Proc_and_Function;
import javax.swing.JOptionPane;

/*
Objetivo:19.	Receba 2 valores reais. Calcule e mostre o maior deles.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex19Proc {
	static double numA, numB;
	public static void main(String[] args) {
		numA = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		numB = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
		calcMaior();
	}	
	
	
	static void calcMaior() {
		if (numA > numB) { 
			JOptionPane.showMessageDialog(null, "O maior número digitado é: " 
					+ String.format("%.2f", numA));
		}
		else {
			JOptionPane.showMessageDialog(null, "O maior número digitado é: " 
					+ String.format("%.2f", numB));
		}
	}
}