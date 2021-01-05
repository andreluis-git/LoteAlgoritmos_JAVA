package Lote.Recursividade;
import javax.swing.JOptionPane;

public class Exercicio_Recursiva01 {
	public static void main(String[] args) {
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
		JOptionPane.showMessageDialog(null, "A soma dos valores é: " + soma(num));
	}
	static int soma(int n) {
		int soma;
		if (n > 1) {
			soma = n + soma(n-1);
			return soma;
		}
		else {
			return n;
		}
	}
}
