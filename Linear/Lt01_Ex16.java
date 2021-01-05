package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:16.	Receba a quantidade de horas trabalhadas, o valor por hora,
 o percentual de desconto e o n�mero de descendentes. Calcule o sal�rio que
  ser�o as horas trabalhadas x o valor por hora. Calcule o sal�rio l�quido 
  (= Sal�rio Bruto � desconto). A cada dependente ser� acrescido R$ 100 no Sal�rio L�quido. 
  Exiba o sal�rio a receber.
Nome: Andr� Luis
Data: 2020-02-17
*/

public class Lt01_Ex16 {
	public static void main(String[] args) {
		int horas, dependentes;
		double valorHora, desconto, salario;
		horas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
		valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor pago por hora trabalhada: "));
		dependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dependentes: "));
		desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite a % de descontos: "));
		desconto = desconto / 100;
		dependentes = dependentes * 100;
		salario = horas * valorHora;
		salario = salario - desconto + dependentes;
		JOptionPane.showMessageDialog(null, "O sal�rio a receber �: R$" + String.format("%.2f", salario));
	}
}
