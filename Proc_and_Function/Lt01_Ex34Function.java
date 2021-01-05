package Lote.Proc_and_Function;
import javax.swing.JOptionPane;

/*
Objetivo:Receba um n�mero. Calcule e mostre os resultados da tabuada desse n�mero.
Nome: Andr� Luis
Data: 2020-02-17
*/

public class Lt01_Ex34Function {
	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro:"));
		String tabuada = calcTabuada(number);
		JOptionPane.showMessageDialog(null, tabuada);
	}
	
	
	static String calcTabuada(int number) {
		String tabuada = "";
		for (int i = 0; i < 11; i++) {
			tabuada += number + " x " + i + " = " + number * i + "\n";
		}
		return tabuada;
	}
}
