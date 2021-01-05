package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex41 {
	public static void main(String[] args) {
		String possib = "";
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < 7; j++) {
				if (i + j == 7) {
					possib += "\n" + i + " - " + j;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Possibilidades:" + possib);
	}
}
