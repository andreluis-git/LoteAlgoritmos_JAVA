package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex40 {
	public static void main(String[] args) {
		int num1, num2;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
		String primos = "";
		if (num2 < num1) {
			int aux = num2;
			num2 = num1;
			num1 = aux;
		}
		if (num1 < num2) {
			for (int i = num1+1; i < num2; i++) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						break;
					}
					else if(j == i-1) {
						primos += "\n" + i;
					}
				}
			}
			JOptionPane.showMessageDialog(null, "Primos: " + primos);
		}
	}
}
