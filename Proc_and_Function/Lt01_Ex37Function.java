package Lote.Proc_and_Function;
import javax.swing.JOptionPane;

/*
Objetivo:Receba um n�mero inteiro. Calcule e mostre a s�rie de Fibonacci at� o seu N�n�simo termo.
Nome: Andr� Luis
Data: 2020-02-17
*/

public class Lt01_Ex37Function {
	public static void main(String[] args) {
		int number;
		String fib;
		number = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro: "));
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
