package Lote.Proc_and_Function;
import javax.swing.JOptionPane;

/*
Objetivo:38.	Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. 
Obs.: somente valores positivos.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex38Function {
	public static void main(String[] args) {
		String array = calcMaiorMenor();		
		JOptionPane.showMessageDialog(null, array);
	}
	
	
	static String calcMaiorMenor() {
		int maior,menor;
		String array = "";
		maior = 0;
		menor = 0;
		for (int j = 0; j < 5; j++) {
			array += "\n";
			for (int i = 0; i < 100; i++) {
				int number = (int)(Math.random() * 1000 + 1);//gera valores randons para economizar tempo de teste
				//int number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo:");
				while (number < 0) {
					number = Integer.parseInt("Valor inválido. Digite um número inteiro positivo:");
				}
				if (j == 0 & i ==0) {
					maior = number;
					menor = number;
				}
				else {
					if (number > maior) {
						maior = number;
					}
					else if(number < menor){
						menor = number;
					}
				}
				array += String.valueOf(number);
				if (i < 99) {
					array += ", ";
				}
			}
		}
		array += "\n" + "Maior: " + maior + "\nMenor: " + menor;
		return array;
	}
}
