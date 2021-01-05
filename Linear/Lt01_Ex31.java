package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo: Calcule e mostre o quadrado dos números entre 10 e 150.
Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex31 {
	public static void main(String[] args) {
		String quadrado = "";
		int cont = 1;
		for (int j = 0; j < 10; j++) {
			quadrado = quadrado + "\n";
			for (int i = 0; i < 15; i++) {
				double x = Math.pow(cont, 2);
				cont++;
				quadrado = (quadrado + " " +  x + ", ");
			}
		}
		JOptionPane.showMessageDialog(null, quadrado);
	}
}
