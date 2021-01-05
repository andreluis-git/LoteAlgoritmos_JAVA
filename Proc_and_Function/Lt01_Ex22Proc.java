package Lote.Proc_and_Function;
import javax.swing.JOptionPane;

/*
Objetivo:22.	Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex22Proc {
	static int val1, val2;
	public static void main(String[] args) {
		val1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
		val2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro diferente do anterior: "));
		ordemCresc();
	}
	
	
	static void ordemCresc() {
		while (val2 == val1) {
			JOptionPane.showMessageDialog(null, "O segundo valor precisa ser diferente do primeiro.");
			val2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro diferente do anterior: "));
		}
		if (val1 < val2) {
			JOptionPane.showMessageDialog(null, "A ordem crescente dos valores digitados é: " + val1 + ", " + val2);
		}
		else {
			JOptionPane.showMessageDialog(null, "A ordem crescente dos valores digitados é: " + val2 + ", " + val1);
		}
	}
}