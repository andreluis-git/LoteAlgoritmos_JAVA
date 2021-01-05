package Lote.Proc_and_Function;
import javax.swing.JOptionPane;

/*
Objetivo:Receba 2 números inteiros, verifique qual o maior entre eles. 
Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex35Function {
	public static void main(String[] args) {
		int num1, num2;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
		int soma = calcSoma(num1,num2);		
		JOptionPane.showMessageDialog(null, soma);
	}
	
	
	static int calcSoma(int num1, int num2) {
		int soma = 0;
		if (num1 > num2) {
			for (int i = num2+1; i < num1; i++) {
				if (i%2 != 0) {
					soma += i;
				}
			}
		}
		else {
			for (int i = num1+1; i < num2; i++) {
				if (i%2 != 0) {
					soma += i;
				}
			}
		}
		return soma;
	}
}
