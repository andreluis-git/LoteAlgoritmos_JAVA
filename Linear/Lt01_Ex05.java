package Lote.Linear;
/*
Objetivo: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o
resultado.
Nome: André Luis
Data: 06/02/20
*/

import javax.swing.JOptionPane;

public class Lt01_Ex05 {

	public static void main(String[] args) {
		double A, B, C, X1, X2;

		A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A:"));
		while (A <= 0) {
			JOptionPane.showMessageDialog(null,"O valor A não pode ser igual ou menor que 0.");
			A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A:"));
		}
		B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B:"));
		C = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C:"));
		double delta = (Math.pow(B, 2) - 4 * A * C);
		if (delta > 0) {
			X1 = (-(B) + Math.sqrt(delta)) / (2 * A);
			X2 = (-(B) - Math.sqrt(delta)) / (2 * A);
			JOptionPane.showMessageDialog(null,"O valor de X1 é: " + String.format("%.2f", X1)
				+ "\nO valor de X2 é: " + String.format("%.2f", X2));
		}
		else {
			JOptionPane.showMessageDialog(null, "A equação digitada não possui 2 raizes.");
		}
	}
}