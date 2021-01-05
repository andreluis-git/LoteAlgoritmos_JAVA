package Lote.Proc_and_Function;
import javax.swing.JOptionPane;

/*
Objetivo:24.	Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex24Proc {
	static int valor;
	public static void main(String[] args) {
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		verifDivisao();
	}
	
	
	static void verifDivisao() {	
		if (valor % 2 == 0 && valor % 3 == 0) {
			JOptionPane.showMessageDialog(null, valor + " é divisivel por 2 e 3.");
		}
		else {
			JOptionPane.showMessageDialog(null, valor + " não é divisivel por 2 e 3.");
		}
	}
}