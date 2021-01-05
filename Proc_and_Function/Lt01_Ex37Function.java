package Lote.Proc_and_Function;
import javax.swing.JOptionPane;

/*
Objetivo:Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex37Function {
	public static void main(String[] args) {
		int number;
		String fib;
		number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		fib = calcFib(number);
		JOptionPane.showMessageDialog(null, fib);
	}
	
	
	static String calcFib(int number) {
		int atual, anterior, aux, soma;
		String serie = "1";
		soma = 0;
		anterior = 0;
		atual = 1;
		for (int i = 0; i < number; i++) {
			if (i > 0) {	
				serie += " + " + atual;
			}
			aux = anterior + atual;
			anterior = atual;
			soma += atual;
			atual = aux;
		}
		serie += " = " + soma;
		return serie;
	}
}
