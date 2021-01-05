package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex45 {
	public static void main(String[] args) {
		double soma, num;
		soma = 1;
		num = 2;
		while (num < 16) {
			double div = (num/(num*num));
			if (num % 2 == 0) {
				soma -= div;
			}
			else {
				soma += div;
			}
			num++;
		}
		JOptionPane.showMessageDialog(null, "Soma: " + soma);
	}
}
