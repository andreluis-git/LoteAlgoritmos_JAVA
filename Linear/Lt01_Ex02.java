package Lote.Linear;
/*
Objetivo: Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
Nome: André Luis
Data: 2020-02-17
*/

import javax.swing.JOptionPane;

public class Lt01_Ex02 {
	public static void main(String[] args) {
		//variaveis
		double salario, reajuste;
		//input do usuario e calculo do reajuste
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do sálario a ser reajustado:"));
		reajuste = salario * 1.15;
		JOptionPane.showMessageDialog(null,"Valor do salário reajustado: R$" 
				+ String.format("%.2f", reajuste));
	}
}
