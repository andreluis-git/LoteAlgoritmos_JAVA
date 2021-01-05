package Lote.Proc_and_Function;
import javax.swing.JOptionPane;

/*
Objetivo:17.	Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l.
 Receber o tempo de percurso e a velocidade média.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex17Proc {
	static double tempo;
	public static void main(String[] args) {
		tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de percurso da viagem: "));
		double vel = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média da viagem: "));
		calcLitros(vel);
	}
	
	
	static void calcLitros(double vel) {
		double litros = ((vel / 60) * tempo) / 12;
		JOptionPane.showMessageDialog(null, "Foram gastos na viagem: " + String.format("%.2f", litros) + " litros.");		
	}
}