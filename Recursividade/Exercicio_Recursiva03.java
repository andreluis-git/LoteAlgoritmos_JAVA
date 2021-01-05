package Lote.Recursividade;
import javax.swing.JOptionPane;

public class Exercicio_Recursiva03 {
	public static void main(String[] args) {
		double num;
		num = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));
		JOptionPane.showMessageDialog(null, div(num, 1.0));
	}
	static double div(double n, double cont) {
		if (cont == n) {
			return 1 / cont;
		}
		else {
			return 1 / cont + div(n, cont + 1);
		}
	}
}
