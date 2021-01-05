package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:Receba um número. Calcule e mostre os resultados da tabuada desse número.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex34 {
	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
		String tabuada = "";
		for (int i = 0; i < 11; i++) {
			tabuada += number + " x " + i + " = " + number * i + "\n";
		}
		JOptionPane.showMessageDialog(null, tabuada);
	}
}
