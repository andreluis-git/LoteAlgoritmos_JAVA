package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:12.	Receba o ano de nascimento e o ano atual. 
Calcule e mostre a sua idade e quantos anos ter� daqui a 17 anos.
Nome: Andr� Luis
Data: 2020-02-17
*/

public class Lt01_Ex12 {
	public static void main(String[] args) {
		int anoNasc, anoAtual, idade;
		anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
		idade = (anoAtual + 17) - anoNasc;
		JOptionPane.showMessageDialog(null, "Daqui a 17 anos ter�: " + idade + " anos.");
	}
}
