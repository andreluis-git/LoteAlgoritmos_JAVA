package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:8.	Receba o valor de um dep�sito em poupan�a. 
Calcule e mostre o valor ap�s 1 m�s de aplica��o sabendo que rende 1,3% a. m.
Nome: Andr� Luis
Data: 2020-02-17
*/

public class Lt01_Ex08 {
	public static void main(String[] args) {
		double deposito, rendimento;
		deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de deposito: "));
		rendimento = deposito * 1.013;
		JOptionPane.showMessageDialog(null, "O valor da aplica��o ap�s 1 m�s �: R$" + String.format("%.2f", rendimento));
	}
}
