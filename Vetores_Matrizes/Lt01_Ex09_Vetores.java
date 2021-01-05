/*
Objetivo: 9.	Criar e carregar uma matriz [4][4] com valores aleatórios, 
sendo que a diagonal principal terá seus dados carregados no programa segundo:

Nome: André Luis
Data: 2020-03-28
*/
package Lote.Vetores_Matrizes;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lt01_Ex09_Vetores {
	public static void main(String[] args) {
		int array[][] = new int[4][4], i, j;
		String exibe = "";
		Random random = new Random();
		for(i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				if (i != j) {
					array[i][j] = random.nextInt(100);
				}
				else if(i > 0 || j > 0) {
					array[i][j] = array[i - 1][j - 1] * 4;
				}
				else {
					array[i][j] = 1;
				}
			}
		}
		for (i = 0; i < 4; i++) {			
			for (j = 0; j < 4; j++) {
				exibe += array[i][j] + " | ";
			}
			exibe += "\n";
		}
		JOptionPane.showMessageDialog(null, exibe);		
	}
}
