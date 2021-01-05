package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:28.	Receba o pre�o atual e a m�dia mensal de um produto. 
Calcule e mostre o novo pre�o sabendo que:
Venda Mensal		Pre�o Atual			Pre�o Novo
< 500				< 30				+ 10%
>= 500 e < 1000		>= 30 e < 80		+15%
>= 1000				>= 80				- 5%
Obs.: para outras condi��es, pre�o novo ser� igual ao pre�o atual.

Nome: Andr� Luis
Data: 2020-02-17
*/

public class Lt01_Ex28 {
	public static void main(String[] args) {
		double preco, media, precoNovo;
		preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o atual do produto: "));
		media = Double.parseDouble(JOptionPane.showInputDialog("Digite a m�dia mensal do produto: "));
		if (media < 500 && preco < 30) {
			precoNovo = preco * 1.1;
		}
		else if (media >= 500 && media < 1000 && preco >= 30 && preco < 80) {
			precoNovo = preco * 1.15;
		}
		else if (media >= 1000 && preco >= 80) {
			precoNovo = preco * 0.95;
		}
		else {
			precoNovo = preco;
		}
		JOptionPane.showMessageDialog(null, "O novo pre�o �: R$ " + precoNovo);
	}
}
