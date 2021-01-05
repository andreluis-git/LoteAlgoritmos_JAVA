package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:8.	Receba o valor de um depósito em poupança. 
Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex08 {
	public static void main(String[] args) {
		double deposito, rendimento;
		deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de deposito: "));
		rendimento = deposito * 1.013;
		JOptionPane.showMessageDialog(null, "O valor da aplicação após 1 mês é: R$" + String.format("%.2f", rendimento));
	}
}
