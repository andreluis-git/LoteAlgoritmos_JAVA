/*
Objetivo: 11.	Criar uma matriz [8][8] inteiro e o programa irá carregar segundo:
11111111
12222221
12333321
12344321
12344321
12333321
12222221
11111111


Nome: André Luis
Data: 2020-03-28
*/
package Lote.Vetores_Matrizes;


import javax.swing.JOptionPane;

public class Lt01_Ex11_Vetores {
	public static void main(String[] args) {
		int array[][] = new int[8][8]; 
		int valor = 1;
		int i, j, x;
		String exibe = "";
		for (x = 0; x < array.length/2; x++) {
			for(i = x; i < 8-x; i++) {
				for (j = x; j < 8-x; j++) {
					array[i][j] = valor;
				}
			}
			valor += 1;
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
