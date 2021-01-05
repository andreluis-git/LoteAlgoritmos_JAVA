package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:9.	Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex09 {
	public static void main(String[] args) {
		int numA, numB;
		numA = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor inteiro: "));
		numB = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor inteiro: "));
		double numA2 = (Math.pow(numA, 2));
		double numB2 = (Math.pow(numB, 2));
		double soma =  numA2 + numB2;
		JOptionPane.showMessageDialog(null, "A soma dos quadrados dos números digitados é: " + String.format("%.2f", soma));
	}
}
