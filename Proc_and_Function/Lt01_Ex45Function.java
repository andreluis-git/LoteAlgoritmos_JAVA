package Lote.Proc_and_Function;
import javax.swing.JOptionPane;

/*
Objetivo:Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex45Function {
	public static void main(String[] args) {
		double soma;
		soma = serieSoma();		
		JOptionPane.showMessageDialog(null, "Soma: " + soma);
	}
	
	
	static double serieSoma() {
		double soma, num;
		soma = 1;
		num = 2;
		while (num < 16) {
			double div = (num/(num*num));
			if (num % 2 == 0) {
				soma -= div;
			}
			else {
				soma += div;
			}
			num++;
		}
		return soma;
	}
}
