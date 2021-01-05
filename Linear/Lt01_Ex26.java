package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:26.	Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex26 {
	public static void main(String[] args) {
		int val1, val2;
		val1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		val2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
		if (val1 % val2 == 0 || val2 % val1 == 0) {
			JOptionPane.showMessageDialog(null, "O maior valor é múltiplo do menor.");
		}
		else {
			JOptionPane.showMessageDialog(null, "O maior valor não é múltiplo do menor.");
		}
	}
}
