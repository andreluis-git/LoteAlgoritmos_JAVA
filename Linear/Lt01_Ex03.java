package Lote.Linear;
/*
Objetivo: Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
Nome: André Luis
Data: 2020-02-17
*/

import javax.swing.JOptionPane;

public class Lt01_Ex03 {
	public static void main(String[] args) {
		double base, altura, area;
		base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do triângulo:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do triângulo:"));
		area = (base*altura)/2;
		JOptionPane.showMessageDialog(null, "O valor da área do triângulo é: " + area);
	}
}
