package Lote.Proc_and_Function;
import javax.swing.JOptionPane;

/*
Objetivo:39.	Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
Casa: 	1	2	3	4	...	64
Qdte:	1	2	4	8	...	N
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex39Function {
	public static void main(String[] args) {
		String resultado = calcGraos();		
		JOptionPane.showMessageDialog(null, resultado.replace("-", "") + " grãos");
	}
	
	
	static String calcGraos() {
		String resultado = "";
		long quant = 1;
		for (int i = 0; i < 63; i++) {
			quant *= 2;
			resultado = String.valueOf(quant);
		}
		return resultado;		
	}
}
