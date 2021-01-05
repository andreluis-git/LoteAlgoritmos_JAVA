package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:24.	Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex24 {
	public static void main(String[] args) {
		int valor;
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		if (valor % 2 == 0 && valor % 3 == 0) {
			JOptionPane.showMessageDialog(null, valor + " é divisivel por 2 e 3.");
		}
		else {
			JOptionPane.showMessageDialog(null, valor + " não é divisivel por 2 e 3.");
		}
	}
}
