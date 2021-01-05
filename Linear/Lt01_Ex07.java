package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:7.	Receba os valores do comprimento, largura e altura de um paralelepípedo. 
Calcule e mostre seu volume.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex07 {
	public static void main(String[] args) {
		double comprimento, larg, alt, volume;
		comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do paralelepípedo: "));
		alt = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do paralelepípedo: "));
		larg = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do paralelepípedo: "));
		volume = comprimento * alt * larg;
		JOptionPane.showMessageDialog(null, "O volume do paralelepípedo é: " + volume);
	}
}
