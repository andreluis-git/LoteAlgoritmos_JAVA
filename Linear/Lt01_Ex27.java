package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:27.	Receba o número de voltas, a extensão do circuito (em metros) 
e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex27 {
	public static void main(String[] args) {
		double extensao, velocidade, voltas, duracao;
		voltas = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de voltas: "));
		duracao = Double.parseDouble(JOptionPane.showInputDialog("Digite a duração em minutos: "));
		extensao = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensao em metros: "));
		velocidade = ((voltas * extensao) / 1000) / (duracao/60);
		JOptionPane.showMessageDialog(null, "A valocidade média foi de " + Math.round(velocidade) + " Km/h.");
	}
}
