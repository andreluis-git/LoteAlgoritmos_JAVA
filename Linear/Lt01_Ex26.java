package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:26.	Receba 2 n�meros inteiros. Verifique e mostre se o maior n�mero � m�ltiplo do menor.
Nome: Andr� Luis
Data: 2020-02-17
*/

public class Lt01_Ex26 {
	public static void main(String[] args) {
		int val1, val2;
		val1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		val2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
		if (val1 % val2 == 0 || val2 % val1 == 0) {
			JOptionPane.showMessageDialog(null, "O maior valor � m�ltiplo do menor.");
		}
		else {
			JOptionPane.showMessageDialog(null, "O maior valor n�o � m�ltiplo do menor.");
		}
	}
}
