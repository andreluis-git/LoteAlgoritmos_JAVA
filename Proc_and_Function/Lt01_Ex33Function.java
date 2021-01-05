package Lote.Proc_and_Function;
import javax.swing.JOptionPane;

/*
Objetivo:Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex33Function {
	public static void main(String[] args) {
		float number,serie;
		number = Float.parseFloat(JOptionPane.showInputDialog("Digite um número:"));
		serie = calcSerie(number);
		JOptionPane.showMessageDialog(null, serie);
	}
	
	
	static float calcSerie(float number) {
		float serie;
		serie = 1;
		for (float i = 2; i <= number; i++) {
			serie += (1/i);
		}
		return serie;
	}
}
