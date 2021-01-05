package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:10.	Receba 2 números reais. Calcule e mostre a diferença desses valores.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex10 {
	public static void main(String[] args) {
		double numA, numB, diff;
		numA = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		numB = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
		diff = numA - numB;
		JOptionPane.showMessageDialog(null, "A diferença entre os números digitados é: " 
				+ String.format("%.2f", diff));
	}
}
