/*
Objetivo: 3.	Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. 
Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. P. ex:
VT1|	1|	2|	3|	|VT2|	4|	5|	6|	|VT3|	1|	2|	3|	4|	5|	6

Nome: André Luis
Data: 2020-03-28
*/
package Lote.Vetores_Matrizes;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class Lt01_Ex03_Vetores {
	public static void main(String[] args) {
		int array1[] = new int[3];
		int array2[] = new int[3];
		int array3[] = new int[6];
		int i;
		Random random = new Random();
		for (i = 0; i < 3; i++) {
			array1[i] = random.nextInt(100);
//			array1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro para o vetor 1:"));			
		}
		for (i = 0; i < 3; i++) {
			array2[i] = random.nextInt(100);
//			array2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro para o vetor 2:"));			
		}
		for (i = 0; i < 3; i++) {
			array3[i] = array1[i];
			array3[i+3] = array2[i];			
		}
		JOptionPane.showMessageDialog(null, "\nVetor 1 = " + Arrays.toString(array1) + "\nVetor 2 = " + Arrays.toString(array2) + "\nVetor 3 = " + Arrays.toString(array3));
	}
}
