package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:Receba um número inteiro. Calcule e mostre o seu fatorial.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex32 {
	public static void main(String[] args) {
		int number;
		number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
		int fatorial = 1;
		for (int i = 1; i < number+1; i++) {
			fatorial *= i;
		}
		JOptionPane.showMessageDialog(null, fatorial);
	}
}
