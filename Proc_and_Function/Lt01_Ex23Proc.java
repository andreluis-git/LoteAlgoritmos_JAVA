package Lote.Proc_and_Function;
import java.util.Arrays;

import javax.swing.JOptionPane;

/*
Objetivo:23.	Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor 
não necessariamente em ordem. Mostre os 4 números em ordem crescente.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex23Proc {
	static double val[] = new double[4];
	public static void main(String[] args) {
		val[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		val[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo valor maior que o anterior: "));
		while (val[0] >= val[1]){
			JOptionPane.showMessageDialog(null, "O valor precisa ser maior que o anterior");
			val[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo valor maior que o anterior: "));
		}
		val[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite um terceiro valor maior que o anterior: "));
		while (val[1] >= val[2]){
			JOptionPane.showMessageDialog(null, "O valor precisa ser maior que o anterior");
			val[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite um terceiro valor maior que o anterior: "));
		}
		val[3] = Integer.parseInt(JOptionPane.showInputDialog("Digite um quarto valor: "));
		ordemCresc();
	}
	
	
	static void ordemCresc() {
		for (int i = 0; i < 3; i++) {
			for (int x = 0; x < 3; x++) {
				if (val[x] > val[x+1]) {
					double aux = val[x+1];
					val[x+1] = val[x];
					val[x] = aux;
				}
			}
		}
		System.out.println(Arrays.toString(val));
	}
}