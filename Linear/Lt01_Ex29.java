package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:29.	Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. 
Demais tipos não serão considerados.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex29 {
	public static void main(String[] args) {
		double valor,tipo;
		tipo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tipo de investimento: \n 1 - Poupança \n 2 - Renda Fixa"));
		if (tipo == 1){
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento:"));
			JOptionPane.showMessageDialog(null, "O rendimento após 30 dias é: R$" + valor*1.03);
		}
		else if (tipo == 2) {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento:"));
			JOptionPane.showMessageDialog(null, "O rendimento após 30 dias é: R$" + valor*1.05);
		}
		else {
			JOptionPane.showMessageDialog(null,"O tipo de investimento digitado não existe.");
		}
	}
}
