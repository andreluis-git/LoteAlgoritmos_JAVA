/*
Objetivo: 6.	Criar e coletar em um vetor [20] com números aleatórios. 
Classificar este vetor em ordem crescente e mostre os dados.

Nome: André Luis
Data: 2020-03-28
*/
package Lote.Vetores_Matrizes;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class Lt01_Ex06_Vetores {
	public static void main(String[] args) {
		int array[] = new int[20], i, j;
		Random random = new Random();
		for(i = 0; i < 20; i++) {
			array[i] = random.nextInt(100);
		}
		for(i = 0; i < 20; i++) {
			for (j = i+1; j < 20; j++) {
				if(array[i] > array[j]) {
					int aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
		JOptionPane.showMessageDialog(null, Arrays.toString(array));
	}
}
