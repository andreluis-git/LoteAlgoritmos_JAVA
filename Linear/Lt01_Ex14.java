package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:14.	Receba 2�ngulos de um tri�ngulo. Calcule e mostre o valor do 3� �ngulo.
Nome: Andr� Luis
Data: 2020-02-17
*/

public class Lt01_Ex14 {
	public static void main(String[] args) {
		double ang1, ang2, ang3;
		ang1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro �ngulo: "));
		ang2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo �ngulo: "));
		ang3 = 180 - (ang1 + ang2);
		JOptionPane.showMessageDialog(null, "O valor do 3� �ngulo �: " + ang3);
	}
}
