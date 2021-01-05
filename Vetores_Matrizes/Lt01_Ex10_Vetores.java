/*
Objetivo: 10.	Criar uma matriz [8][8] onde o programa irá carregar segundo:
casa  1 2 3 4 5 6 7 8...
valor 1 2 4 8 16 32 64...

Nome: André Luis
Data: 2020-03-28
*/
package Lote.Vetores_Matrizes;


import javax.swing.JOptionPane;

public class Lt01_Ex10_Vetores {
	public static void main(String[] args) {
		double array[][] = new double[8][8], valor = 0.5;
		int i, j;
		String exibe = "";
		for(i = 0; i < 8; i++) {
			for (j = 0; j < 8; j++) {
				valor *= 2;
				array[i][j] = valor;
			}
		}
		for (i = 0; i < 8; i++) {			
			for (j = 0; j < 8; j++) {
				exibe += array[i][j] + " || ";
			}
			exibe += "\n";
		}
		JOptionPane.showMessageDialog(null, exibe);		
	}
}
