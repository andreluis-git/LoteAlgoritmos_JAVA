package Lote.Recursividade;
import javax.swing.JOptionPane;

public class Exercicio_Recursiva02_1 {
	public static void main(String[] args) {
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
		JOptionPane.showMessageDialog(null, soma(num, 0));
	}
	static int soma(int n, int cont) {
		if (cont == n) {
			return n - cont;
		}
		else {
			return (n - cont) + soma(n, cont+1);
		}
	}
}
