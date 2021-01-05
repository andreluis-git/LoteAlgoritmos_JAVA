package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex42 {
	public static void main(String[] args) {
		float soma, num, div;
		soma = 1;
		for (int i = 1; i < 50; i++) {
			num = i+1;
			div = num*2-1;
			soma += (num/div);
		}
		JOptionPane.showMessageDialog(null, soma);
	}
}
