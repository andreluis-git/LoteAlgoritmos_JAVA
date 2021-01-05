/*
Objetivo: 12.	Carregar códigos das peças em um tabuleiro de xadrez, onde:
Código 1 2 3 4 5 6 7
Peça Peão Torre Bispo Cavalo Rainha Rei Vazio

Nome: André Luis
Data: 2020-03-28
*/
package Lote.Vetores_Matrizes;


import java.util.Random;

import javax.swing.JOptionPane;

public class Lt01_Ex12_Vetores {
	public static void main(String[] args) {
		int array[][] = new int[2][7]; 
		int tabuleiro[][] = new int[8][8];
		int i, j;
		Random random = new Random();
		String exibe = "Tabuleiro:\n";
		for(i = 0; i < 8; i++) {
			for (j = 0; j < 8; j++) {
				tabuleiro[i][j] = random.nextInt(7) +1;
			}
		}
		for(i = 0; i < 7; i++) {
			array[0][i] = i + 1;
		}
		for(i = 0; i < 8; i++) {
			for (j = 0; j < 8; j++) {
				array[1][tabuleiro[i][j] - 1] += 1;
			}
		}
		for (i = 0; i < 8; i++) {			
			for (j = 0; j < 8; j++) {
				exibe += tabuleiro[i][j] + " | ";
			}
			exibe += "\n";
		}
		exibe += "Código: 1 | 2 | 3 | 4 | 5 | 6 | 7 |\nPeças: ";
		for (j = 0; j < 7; j++) {
				exibe += array[1][j] + " | ";
		}
		JOptionPane.showMessageDialog(null, exibe);		
	}
}
