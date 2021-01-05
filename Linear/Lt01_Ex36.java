package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:Receba um n�mero N. Calcule e mostre a s�rie 1 + 1/1! + 1/2! + ... + 1/N!
Nome: Andr� Luis
Data: 2020-02-17
*/

public class Lt01_Ex36 {
	public static void main(String[] args) {
		float number, serie, fat;
		serie = 1;
		number = Float.parseFloat(JOptionPane.showInputDialog("Digite um n�mero:"));
		for (float i = 1; i < number+1; i++) {
			fat = 1;
			// Calcula o valor fatorial a ser dividido
			for (float j = 1; j < i+1; j++) {
				fat *= j;
			}
			serie += (1/fat);
		}
		JOptionPane.showMessageDialog(null, serie);
	}
}
