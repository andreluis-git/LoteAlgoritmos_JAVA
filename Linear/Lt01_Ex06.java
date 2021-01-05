package Lote.Linear;
/*
Objetivo:6.	Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
Nome: André Luis
Data: 2020-02-17
*/

import javax.swing.JOptionPane;


public class Lt01_Ex06 {
	public static void main(String[] args) {
		double x, y, aux;
		x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x: "));
		y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y: "));
		aux = x;
		x = y;
		y = aux;
		JOptionPane.showMessageDialog(null, "x = " + x + " y =  " + y);
	}
}
