package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:20.	Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. 
Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex20 {
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
		if (delta >= 0) {
			if (delta == 0) {
				X1 = (-(B) + Math.sqrt(delta)) / (2 * A);
				JOptionPane.showMessageDialog(null,"A equação possui raizes iguais: " + String.format("%.2f", X1));
			}
			else {
			X1 = (-(B) + Math.sqrt(delta)) / (2 * A);
			X2 = (-(B) - Math.sqrt(delta)) / (2 * A);
			JOptionPane.showMessageDialog(null,"O valor de X1 é: " + String.format("%.2f", X1)
				+ "\nO valor de X2 é: " + String.format("%.2f", X2));
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "A equação digitada não possui raizes reais.");
		}
	}
}
