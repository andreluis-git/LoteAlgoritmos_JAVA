package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:Receba o número da base e do expoente. Calcule e mostre o valor da potência.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex44 {
	public static void main(String[] args) {
		double base,expoente,potencia;
		base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base:"));
		expoente = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do expoente:"));
		potencia = Math.pow(base,expoente);
		JOptionPane.showMessageDialog(null, potencia);
	}
}
