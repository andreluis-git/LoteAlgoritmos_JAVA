package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:17.	Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l.
 Receber o tempo de percurso e a velocidade média.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex17 {
	public static void main(String[] args) {
		double tempo, vel, litros;
		tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de percurso da viagem: "));
		vel = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média da viagem: "));
		litros = ((vel / 60) * tempo) / 12;
		JOptionPane.showMessageDialog(null, "Foram gastos na viagem: " + litros + "litros.");		
	}
}
