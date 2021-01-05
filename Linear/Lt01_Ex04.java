package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:Receba a temperatura em graus Celsius. 
Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex04 {
	public static void main(String[] args) {
		double C, F;
		C = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius: "));
		F = (9*C+160) /5;
		JOptionPane.showMessageDialog(null, "A temperatura digitada convertida em Fahrenheit é:" + F);
	}
}
