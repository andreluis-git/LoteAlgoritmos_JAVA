package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:11.	Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex11 {
	public static void main(String[] args) {
		double comp, raio;
		raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da circunferência: "));
		comp =(2*raio*3.14);
		JOptionPane.showMessageDialog(null, "O comprimento da circunferência é: " + String.format("%.2f", comp));
	}
}
