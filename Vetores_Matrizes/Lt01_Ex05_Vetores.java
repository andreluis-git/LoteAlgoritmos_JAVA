/*
Objetivo: 5.	Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:
10
Somatório (A[1] – A[21–1])
i = 1


Nome: André Luis
Data: 2020-03-28
*/
package Lote.Vetores_Matrizes;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class Lt01_Ex05_Vetores {
	public static void main(String[] args) {
		int array[] = new int[20], i, soma = 0;
		Random random = new Random();
		for(i = 0; i < 20; i++) {
			array[i] = random.nextInt(100);
//			array[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro:"));
		}
		for(i = 0; i < 10; i++) {
			soma += array[i] - array[19 - i];
		}
		JOptionPane.showMessageDialog(null, "O resultado da soma dos valores segundo a função \n10\r\n" + 
				"Somatório (A[1] – A[21–1])\r\n" + 
				"i = 1: \n" + Arrays.toString(array) + "\nSoma: " + soma);
	}
}
