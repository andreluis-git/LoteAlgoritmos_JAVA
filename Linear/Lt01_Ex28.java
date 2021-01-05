package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:28.	Receba o preço atual e a média mensal de um produto. 
Calcule e mostre o novo preço sabendo que:
Venda Mensal		Preço Atual			Preço Novo
< 500				< 30				+ 10%
>= 500 e < 1000		>= 30 e < 80		+15%
>= 1000				>= 80				- 5%
Obs.: para outras condições, preço novo será igual ao preço atual.

Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex28 {
	public static void main(String[] args) {
		double preco, media, precoNovo;
		preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual do produto: "));
		media = Double.parseDouble(JOptionPane.showInputDialog("Digite a média mensal do produto: "));
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
		JOptionPane.showMessageDialog(null, "O novo preço é: R$ " + precoNovo);
	}
}
