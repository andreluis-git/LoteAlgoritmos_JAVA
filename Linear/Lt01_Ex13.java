package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:13.	Receba a quantidade de alimento em quilos. 
Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex13 {
	public static void main(String[] args) {
		double quilos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de alimento em quilos; "));
		double dias = (quilos * 1000) / 50;
		JOptionPane.showMessageDialog(null, "A quantidade de alimentos digitada durará: " 
				+ String.format("%.0f", dias) + " dias.");
	}
}
