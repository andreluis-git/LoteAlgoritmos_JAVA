package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex37 {
	public static void main(String[] args) {
		int number, atual, anterior, aux, soma;
		String serie = "1";
		number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
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
		JOptionPane.showMessageDialog(null, serie + " = " + soma);
	}
}
