package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:38.	Receba 100 n�meros inteiros reais. Verifique e mostre o maior e o menor valor. 
Obs.: somente valores positivos.
Nome: Andr� Luis
Data: 2020-02-17
*/

public class Lt01_Ex38 {
	public static void main(String[] args) {
		String array = "";
		int maior,menor;
		maior = 0;
		menor = 0;
		for (int j = 0; j < 5; j++) {
			array += "\n";
			for (int i = 0; i < 20; i++) {
				int number = (int)(Math.random() * 1000 + 1);//gera valores randons para economizar tempo de teste
				//int number = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro positivo:");
				while (number < 0) {
					number = Integer.parseInt("Valor inv�lido. Digite um n�mero inteiro positivo:");
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
				if (i < 19) {
					array += ", ";
				}
			}
		}
		JOptionPane.showMessageDialog(null, array + "\n" + "Maior: " + maior + "\nMenor: " + menor);
	}
}
