package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:11.	Receba o raio de uma circunfer�ncia. Calcule e mostre o comprimento da circunfer�ncia.
Nome: Andr� Luis
Data: 2020-02-17
*/

public class Lt01_Ex11 {
	public static void main(String[] args) {
		double comp, raio;
		raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da circunfer�ncia: "));
		comp =(2*raio*3.14);
		JOptionPane.showMessageDialog(null, "O comprimento da circunfer�ncia �: " + String.format("%.2f", comp));
	}
}
