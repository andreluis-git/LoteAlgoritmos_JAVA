package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:Calcule e mostre quantos anos serão necessários para que Ana seja maior que 
Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex43 {
	public static void main(String[] args) {
		double ana, maria;
		int ano;
		ana = 1.1 * 100;
		maria = 1.5 * 100;
		ano = 0;
		while (maria > ana) {
			maria += 2;
			ana += 3;
			ano ++;
		}
		JOptionPane.showMessageDialog(null, String.format("Serão necessarios %d anos para Ana ser maior que Maria.", ano));
	}
}
