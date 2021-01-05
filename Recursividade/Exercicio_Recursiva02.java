package Lote.Recursividade;
import javax.swing.JOptionPane;

public class Exercicio_Recursiva02 {
	public static void main(String[] args) {
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
		JOptionPane.showMessageDialog(null, soma(num));
	}
	static int soma(int n) {
		int x;
		if (n > 1) {
			x = n + soma(n-1);
			return x;
		}
		else {
			return n;
		}
	}
}
