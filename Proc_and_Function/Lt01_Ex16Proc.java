package Lote.Proc_and_Function;
import javax.swing.JOptionPane;

/*
Objetivo:16.	Receba a quantidade de horas trabalhadas, o valor por hora,
 o percentual de desconto e o número de descendentes. Calcule o salário que
  serão as horas trabalhadas x o valor por hora. Calcule o salário líquido 
  (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. 
  Exiba o salário a receber.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex16Proc {
	static int horas, dependentes;
	static double valorHora, desconto, salario;
	public static void main(String[] args) {
		horas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
		valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor pago por hora trabalhada: "));
		dependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dependentes: "));
		desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite a % de descontos: "));
		salarioLiquido();
	}	
	
	
	static void salarioLiquido() {
		desconto = desconto / 100;
		dependentes = dependentes * 100;
		salario = horas * valorHora;
		salario = salario - desconto + dependentes;
		JOptionPane.showMessageDialog(null, "O salário a receber é: R$" + String.format("%.2f", salario));
	}
}