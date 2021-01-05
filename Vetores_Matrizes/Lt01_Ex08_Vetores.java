/*
Objetivo: 8.	Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos 
em 4 semanas. Calcular e exibir:
a.	A quantidade de cada produto vendido no mês;
b.	A quantidade de produtos vendidos por semana;
c.	O total de produtos vendidos no mês

Nome: André Luis
Data: 2020-03-28
*/
package Lote.Vetores_Matrizes;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lt01_Ex08_Vetores {
	public static void main(String[] args) {
		int array[][] = new int[4][3], i, j, venda_mes[] = new int[3], venda_produto[] = new int[4], total_vendas = 0;
		Random random = new Random();
		for(i = 0; i < 4; i++) {
			for (j = 0; j < 3; j++) {
				array[i][j] = random.nextInt(100);
				//array[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para:\nSemana: " + (i + 1) + "\nProduto: " + (j + 1)));
			}
		}
		for(i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				venda_mes[i] += array[j][i];
				total_vendas += array[j][i];
			}
		}
		for(i = 0; i < 4; i++) {
			for (j = 0; j < 3; j++) {
				venda_produto[i] += array[i][j];
			}
		}
		JOptionPane.showMessageDialog(null, "Quantidade de produtos 1: " + venda_mes[0] 
				+ "\nQuantidade de produtos 2: " + venda_mes[1]
				+ "\nQuantidade de produtos 3: " + venda_mes[2]
				+ "\nQuantidade de produtos na semana 1: " + venda_produto[0] 
				+ "\nQuantidade de produtos na semana 2: " + venda_produto[1]
				+ "\nQuantidade de produtos na semana 3: " + venda_produto[2] 
				+ "\nQuantidade de produtos na semana 4: " + venda_produto[3] 
				+ "\nTotal de produtos vendidos: " + total_vendas);
	}
}
