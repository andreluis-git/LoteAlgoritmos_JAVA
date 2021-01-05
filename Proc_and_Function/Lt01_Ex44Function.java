package Lote.Proc_and_Function;
import javax.swing.JOptionPane;

/*
Objetivo:Receba o número da base e do expoente. Calcule e mostre o valor da potência.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex44Function {
	public static void main(String[] args) {
		double base,expoente,potencia;
		base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base:"));
		expoente = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do expoente:"));
		potencia = calcPotencia(base,expoente);
		JOptionPane.showMessageDialog(null, potencia);
	}
	
	
	static double calcPotencia(double base, double expo) {
		double potencia;
		potencia = Math.pow(base,expo);
		return potencia;
	}
}
