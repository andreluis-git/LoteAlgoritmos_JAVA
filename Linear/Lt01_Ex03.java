package Lote.Linear;
/*
Objetivo: Receba a base e a altura de um tri�ngulo. Calcule e mostre a sua �rea.
Nome: Andr� Luis
Data: 2020-02-17
*/

import javax.swing.JOptionPane;

public class Lt01_Ex03 {
	public static void main(String[] args) {
		double base, altura, area;
		base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do tri�ngulo:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do tri�ngulo:"));
		area = (base*altura)/2;
		JOptionPane.showMessageDialog(null, "O valor da �rea do tri�ngulo �: " + area);
	}
}
