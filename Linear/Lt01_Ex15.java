package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:15.	Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex15 {
	public static void main(String[] args) {
		double cat1, cat2, hipo;
		cat1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro cateto: "));
		cat2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo cateto: "));
		cat1 = Math.pow(cat1, 2);
		cat2 = Math.pow(cat2, 2);
		hipo = Math.sqrt(cat1 + cat2);
		JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: " + String.format("%.2f",hipo));
	}
}
