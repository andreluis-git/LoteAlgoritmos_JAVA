package Lote.Linear;
/*
Objetivo: Receba o sal�rio de um funcion�rio e mostre o novo sal�rio com reajuste de 15%.
Nome: Andr� Luis
Data: 2020-02-17
*/

import javax.swing.JOptionPane;

public class Lt01_Ex02 {
	public static void main(String[] args) {
		//variaveis
		double salario, reajuste;
		//input do usuario e calculo do reajuste
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do s�lario a ser reajustado:"));
		reajuste = salario * 1.15;
		JOptionPane.showMessageDialog(null,"Valor do sal�rio reajustado: R$" 
				+ String.format("%.2f", reajuste));
	}
}
