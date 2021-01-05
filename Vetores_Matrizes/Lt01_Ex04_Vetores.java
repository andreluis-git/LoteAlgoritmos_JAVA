/*
Objetivo: 4.	Criar e coletar em um vetor [30] real e calcular e exibir:
a.	A média do grupo;
b.	A quantidade de notas acima do grupo;
c.	As posições dos valores abaixo da média do grupo.
Nome: André Luis
Data: 2020-03-28
*/
package Lote.Vetores_Matrizes;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lt01_Ex04_Vetores {
	public static void main(String[] args) {
		float array[] = new float[30], media = 0;
		int i, acima= 0;
		String position ="";
		Random random = new Random();
		for (i = 0; i < 30; i++) {
			array[i] = random.nextFloat() * 100;			
		}		
		for (i = 0; i < 30; i++) {
			media += array[i];			
		}
		media /= 30;
		for (i = 0; i < 30; i++) {
			if(array[i] > media) {
				acima += 1;
			}
			else if(array[i] < media) {
				position += i + " ";
			}
		}
				
		JOptionPane.showMessageDialog(null, "Media do grupo: " + media + "\nQuantidade de notas acima da média: " + acima + "\nPosição dos valores abaixo da média: " + position);
	}
}
