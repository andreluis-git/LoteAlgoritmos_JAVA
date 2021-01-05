package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:39.	Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
Casa: 	1	2	3	4	...	64
Qdte:	1	2	4	8	...	N
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex39 {
	public static void main(String[] args) {
		long quant = 1;
		String resultado = "";
		for (int i = 0; i < 63; i++) {
			quant *= 2;
			resultado = String.valueOf(quant);
		}
		JOptionPane.showMessageDialog(null, resultado.replace("-", ""));
	}
}
