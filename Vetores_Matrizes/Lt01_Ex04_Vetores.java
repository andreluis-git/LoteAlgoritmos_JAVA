/*
Objetivo: 4.	Criar e coletar em um vetor [30] real e calcular e exibir:
a.	A m�dia do grupo;
b.	A quantidade de notas acima do grupo;
c.	As posi��es dos valores abaixo da m�dia do grupo.
Nome: Andr� Luis
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
				
		JOptionPane.showMessageDialog(null, "Media do grupo: " + media + "\nQuantidade de notas acima da m�dia: " + acima + "\nPosi��o dos valores abaixo da m�dia: " + position);
	}
}
